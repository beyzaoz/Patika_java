package Week_2_Projects;

import java.util.Scanner;

public class Power_Number {
    //Recursive power
    //2^3 ..> 2*2*2 =8

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your number: ");

        int basenum = scanner.nextInt();

        System.out.println("Enter your power number: ");

        int pwnum = scanner.nextInt();

        int result = powerfinder(basenum,pwnum);
        System.out.println("Result: " + result);


    }

    public static int powerfinder( int basenum, int pwnum){
        if(pwnum == 0){
            return 1;
        }
       return basenum * powerfinder(basenum,pwnum-1);

    }
}
