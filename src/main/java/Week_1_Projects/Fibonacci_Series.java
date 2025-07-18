package Week_1_Projects;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        //fibonacci 0,1,1,2,3,5,8...  sum last two number.
        int i = 0;
        int j = 1;

        while(j<=number){
            System.out.println( j + "," );

            int nextnum = i+j; //Generate next value.
            i = j; //i became the 2. number.
            j = nextnum; // j become the 1. number.





        }

    }
}
