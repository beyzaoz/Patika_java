package Week_1.Loops;

import java.util.Scanner;

public class While_Loops_Main {
    public static void main(String[] args) {

        /**int i = 0 ;
        while (i<10){
            System.out.println(i);
            i ++;

        }**/
            Scanner scanner = new Scanner(System.in);
            String password = "1234";
            while (true){
                System.out.println("Sifreyi Giriniz: ");
                String input = scanner.nextLine();

                if(password.equals(input)){
                    System.out.println("Sifreniz dogru!");
                   break;
                }else{
                    System.out.println("Sifreniz yanlis!");
                }
            }
    }
}
