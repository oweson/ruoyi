package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/25 15:26
 */
public class SingleThreadPoolDemo {
    public static class TestThreadPool extends Thread {
        //记录线程的开始,结束以及计算出消耗时间
        long startTime;
        long endTime;
        long resumeTime;

        @Override
        public void run() {
            startTime = System.currentTimeMillis();
            System.out.println("线程" + Thread.currentThread().getName() + "开始执行时间: " + System.currentTimeMillis());
            //线程睡眠,模拟执行
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //执行完成后输出时间
            endTime = System.currentTimeMillis();
            System.out.println("线程" + Thread.currentThread().getName() + "结束执行时间: " + System.currentTimeMillis());

            resumeTime = endTime - startTime;
            System.out.println("线程" + Thread.currentThread().getName() + "消耗时间:" + resumeTime);
        }
    }

    public static void main(String[] args) {
        TestThreadPool TP1 = new TestThreadPool();

        //实例化线程池
        ExecutorService ES = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
            ES.submit(TP1);
        }
        // 执行完关闭
        ES.shutdown();

    }
}
