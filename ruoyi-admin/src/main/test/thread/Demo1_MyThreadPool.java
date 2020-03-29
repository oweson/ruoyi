package thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/25 16:17
 */
public class Demo1_MyThreadPool {
    private LinkedBlockingDeque<WorkerThread> workerThreads=new LinkedBlockingDeque<WorkerThread>();
    //工作线程存放在此容器里
    private BlockingDeque<Runnable> workDeque;
    //任务队列
    private int corePoolSize;
    // 最大线程数量
    private int maximumPoolSize;
    // 最小线程数量
    private long keepAliveTime;
    //非核心线程存活的时间。

    public Demo1_MyThreadPool(BlockingDeque<Runnable> workDeque, int corePoolSize, int maximumPoolSize, long keepAliveTime) {
        this.workDeque = workDeque;
        this.corePoolSize = corePoolSize;
        this.maximumPoolSize = maximumPoolSize;
        this.keepAliveTime = keepAliveTime;
    }

    public void execut(Runnable task){
        //小于核心线程数 直接创建线程来运行任务。
        if(workerThreads.size()<=corePoolSize){
            runTask(task);
        }else{
            workDeque.add(task);
        }
    }


    private void runTask(Runnable task){
        WorkerThread workerThread=new WorkerThread(task,this);
        Thread thread=workerThread.getT();
        thread.run();
        //实际调的是wokerThread 的run 方法。
        workerThread.setTask(null);
        //将里面的task 清空
        workerThreads.add(workerThread);
    }

    public BlockingDeque<Runnable> getWorkDeque() {
        return workDeque;
    }

    public void setWorkDeque(BlockingDeque<Runnable> workDeque) {
        this.workDeque = workDeque;
    }

    public int getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public int getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public void setMaximumPoolSize(int maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    public long getKeepAliveTime() {
        return keepAliveTime;
    }

    public void setKeepAliveTime(long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    public LinkedBlockingDeque<WorkerThread> getWorkerThreads() {
        return workerThreads;
    }

    public void setWorkerThreads(LinkedBlockingDeque<WorkerThread> workerThreads) {
        this.workerThreads = workerThreads;
    }

    public void removeWorkThread(WorkerThread workerThread){
        workDeque.remove(workerThread);
    }
}
