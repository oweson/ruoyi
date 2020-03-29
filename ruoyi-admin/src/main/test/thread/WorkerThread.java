package thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/25 16:17
 */
public class WorkerThread implements Runnable {
    private Runnable task;
    private Thread t;
    //这是工作线程里的真正的线程
    private Demo1_MyThreadPool threadPool;

    public WorkerThread(Runnable task,Demo1_MyThreadPool threadPool) {
        this.task = task;
        this.threadPool=threadPool;
        t=new Thread(this);
        //这是非常重要的一比，工作线程放入此对象了，t.run 方法会走到workThread 对象的run 方法
    }

    @Override
    public void run() {
        //gettask方法是核心，可保证在线程数小于非核心线程数的情况下 循环一直存在，run 方法一直阻塞不会退出。
        while (task!=null || getTask(threadPool)!=null){
            task.run();
        }
        //如果退出了上面的循环 说明该工作线程为非核心线程，需要从工作线程队列里移除了。
        threadPool.removeWorkThread(this);
    }

    private Runnable getTask(Demo1_MyThreadPool threadPool){
        BlockingDeque<Runnable> workQue=threadPool.getWorkDeque();
        Runnable task=null;
        if(threadPool.getWorkerThreads().size()<=threadPool.getCorePoolSize()){
            //当前线程数小于核心线程数
            try {
                task=threadPool.getWorkDeque().take();
                //阻塞的方式获取，一直获取为止，这样上面的run 方法就会一直无限死循环来获取，此核心线程就不会被销毁（正常情况下一个线程run 玩就被销毁了）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{//当前工作线程数超过核心线程数
            try {
                //非核心线程数，等待一段时间如果取不到就会退出上面的run 方法的while 循环了
                task=threadPool.getWorkDeque().poll(threadPool.getKeepAliveTime(), TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return task;
    }
    public Thread getT() {
        return t;
    }

    public void setT(Thread t) {
        this.t = t;
    }

    public Runnable getTask() {
        return task;
    }

    public void setTask(Runnable task) {
        this.task = task;
    }
}
