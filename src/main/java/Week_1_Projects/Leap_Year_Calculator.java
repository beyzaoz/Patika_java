package Week_1_Projects;

import java.util.Scanner;

public class Leap_Year_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls Enter a date (1900): ");
        int date = scanner.nextInt();

        if(date % 100 == 0){
            if(date % 4 ==0){
                System.out.println("It is a Leak Year. ");
            }
            else{
                System.out.println("It is a not Leak year. ");
            }
        }

        else {
            if(date % 4 ==0){
                System.out.println("It is a Leak Year. ");
            }
            else{
                System.out.println("It is a not Leak year. ");
            }
        }
    }
}
