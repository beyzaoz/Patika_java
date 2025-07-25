package Week_2_Projects;

import java.util.Scanner;

public class Polyndrom_check {

    //Polyndrom: when you write the number from reverse if it is the same number it is polyndrom
    //121-->121 Polyndrom
    //123-->321 Not a Polyndrom

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();


        boolean isPolyndrom = Polyndrom(number);

        if(isPolyndrom){
            System.out.println("It is polyndrom number. ");
        }else{
            System.out.println("It is not a polydrom. ");
        }


    }

    public static boolean Polyndrom(int number){
        int original =number;
        int reverse = 0;


        while(number>0){
            int digit = number%10;
            reverse = (reverse*10) + digit;
            number/=10; //number = number/10;

        }

        return original ==reverse;


    }
}
