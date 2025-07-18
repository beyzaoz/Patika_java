package Week_1_Projects;

import java.util.Scanner;

public class Odd_Even_Checker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        /**for(int i = 0; i<=number; i++){
            if (i % 2 == 0){
                System.out.println(i + " It is a even number. ");
            }else{
                System.out.println(i +" It is a odd number. ");
            }
        }**/
        int i =0;
        while(i<=number){
            if (i % 2 == 0){
                System.out.println(i + " It is a even number. ");

            }else{
                System.out.println(i +" It is a odd number. ");
            }
            i++;
        }
    }
}
