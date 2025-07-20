package Week_1.Switch_Case;

import java.util.Scanner;

public class Switch_case_Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        double number1 = scanner.nextDouble();
        System.out.println("Ikinci sayiyi giriniz: ");
        double number2 = scanner.nextDouble();

        System.out.println("Islem seciniz( +,-,*,/): ");
        char operation = scanner.next().charAt(0);
        switch(operation){

            case '+':
                System.out.println("Result: " +(number1+number2));
                break;

            case '-':
                System.out.println("Result: " +(number1-number2));
                break;

            case '*':
                System.out.println("Result: " + (number1*number2));
                break;


            case '/':
                if(number2 !=0){
                System.out.println("Result: "+ (number1/number2));
                }else{
                    System.out.println("Second number is 0!");
                }
                break;


            default:
                System.out.println("Not Valid!");


        }
    }
}
