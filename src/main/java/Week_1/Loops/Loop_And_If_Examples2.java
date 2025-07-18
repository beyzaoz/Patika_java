package Week_1.Loops;

import java.util.Scanner;

public class Loop_And_If_Examples2 {
    public static void main(String[] args) {
        //Factorial calculator 4!=1*2*3*4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        for(int i = 1 ;i<=number ;i++){
            factorial = factorial* i;

        }

        System.out.println("Factorial is: "+ factorial);

    }
}
