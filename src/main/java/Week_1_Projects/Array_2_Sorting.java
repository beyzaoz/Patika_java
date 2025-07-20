package Week_1_Projects;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2_Sorting {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How Many number will entered?");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i<size ;i++){
            System.out.println("Enter Your "+ (i+1) + ". number: ");
            numbers[i] = scanner.nextInt();// each number that entered will assign to the array
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);

        }



    }
}
