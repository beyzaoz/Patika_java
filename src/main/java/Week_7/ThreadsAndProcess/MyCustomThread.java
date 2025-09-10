package Week_7.ThreadsAndProcess;

import javax.swing.*;

public class MyCustomThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is working...");
    }
}
