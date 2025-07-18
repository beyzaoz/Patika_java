package Week_1_Projects;

import java.util.Scanner;

public class Odd_Even_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("It is a even number.");
        }else{
            System.out.println("It is a odd number. ");
        }
    }
}
