package Week_3;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Test {
    public static void main(String[] args) {
        Queue<String> breadQueue =  new PriorityQueue<>();
        breadQueue.add("Cem");
        breadQueue.add("Elif");
        breadQueue.add("Ahmet");
        breadQueue.add("Aliye");

        for(String s:breadQueue){
            System.out.println(s); //Did not show the order that we add. Not FIFO(First in First Out)
        }
        System.out.println(breadQueue.remove());
        System.out.println(breadQueue.peek());


    }
}
