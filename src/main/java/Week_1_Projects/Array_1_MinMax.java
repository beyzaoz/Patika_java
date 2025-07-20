package Week_1_Projects;

import java.util.Scanner;

public class Array_1_MinMax {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How Many number will entered?");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i<size ;i++){
            System.out.println("Enter Your "+ (i+1) + ". number: ");
            numbers[i] = scanner.nextInt();// each number that entered will assign to the array
        }

        int max = 0;
        int min= numbers[0]; // If we do like int min = 0; it gives error because there is no number smaller than 0;

        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }

        }
        System.out.println("Biggest number is " + max +"Smallest number is " + min);

    }
}
