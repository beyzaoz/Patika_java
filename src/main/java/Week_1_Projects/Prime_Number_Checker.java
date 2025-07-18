package Week_1_Projects;

import java.util.Scanner;

public class Prime_Number_Checker {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true ; //Default degeri true

        for(int i = 2; i<num;i++){
            if(num % i ==0){   //
                isPrime=false;
            }
        }

        if(isPrime){
            System.out.println("It is a Prime Number.");
        }else {
            System.out.println("It is NOT a Prime Number.");
        }
    }
}
