package Week_2_Projects;

import java.util.Scanner;

public class Recursive_Digit_Sum {

    // 123 --> 1+2+3 = 6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();

        int sum = 0;

        int result = Sumof(num,sum);
        System.out.println("Result is " + result );

    }

    public static int Sumof(int num, int sum) {
        while(num>0){
            int each = num%10;
            sum += each;
            num = num/10;

        }

        return sum;


    }
}
