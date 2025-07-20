package Week_1_Projects;

import java.util.Scanner;

public class Array_3_Count_Number {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How Many number will entered?");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i<size ;i++){
            System.out.println("Enter Your "+ (i+1) + ". number: ");
            numbers[i] = scanner.nextInt();// each number that entered will assign to the array
        }
        int counter = 0;

        System.out.println("Search the number: ");
        int number = scanner.nextInt();
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] == number){
                counter ++;

            }

        }
        System.out.println(counter +" piece");
    }
}
