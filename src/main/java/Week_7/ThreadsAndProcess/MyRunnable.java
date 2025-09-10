package Week_7.ThreadsAndProcess;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is working" + Thread.currentThread().getName());
    }
}
