package Week_2_Projects;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int num = scanner.nextInt();

        int result = PrimeNum(num);

    }

    public static int PrimeNum(int num){
        if(num==0){
            System.out.println("It is not a Prime Number. ");
        }else if(num==1){
            System.out.println("It is a Prime Number. ");
        }else{
            if(num%2==0){

                System.out.println("It is not a Prime Number. ");
            }else{
                for(int i=3; i<num;i+=2){
                    if(num%i == 0){
                        System.out.println("It is not a Prime Number. ");
                    }
                    System.out.println("It is a Prime Number. ");
                    return num;

                }
            }
        }

        return num;
    }
}
