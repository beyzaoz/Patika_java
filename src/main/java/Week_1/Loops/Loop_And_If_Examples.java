package Week_1.Loops;

import java.util.Scanner;

public class Loop_And_If_Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        if(number>0){
            System.out.println("Positive number " +number);
        }else if(number < 0){
            System.out.println("Negative number: " + number);
        }else{
            System.out.println("Equal to 0. ");
        }
    }
}
