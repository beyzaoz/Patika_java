package Week_7.ThreadPracticeMemoryGame;

import java.util.List;

public class NumberDisplayTask implements Runnable{

    private final List<Integer> numbers;
    private final int delay;

    public NumberDisplayTask(List<Integer> numbers, int delay) {
        this.numbers = numbers;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int number: numbers) {
            clearConsole();
            System.out.println(number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }

        }

    }

    private void clearConsole(){
        for (int i = 0; i < 25; i++) {
            System.out.println("  ");
        }
    }
}
