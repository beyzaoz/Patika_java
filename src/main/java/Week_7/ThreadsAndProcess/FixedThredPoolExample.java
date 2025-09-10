package Week_7.ThreadsAndProcess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThredPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=1;i<=25;i++){
            int taskis = 1;
            executorService.submit(()->{
                System.out.println("Task" + taskis + "calisiyor..." + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown(); // threadpool kapanmali.
    }
}
