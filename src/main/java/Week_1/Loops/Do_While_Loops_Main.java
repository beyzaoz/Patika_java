package Week_1.Loops;

import java.util.Scanner;

public class Do_While_Loops_Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String password = "1234";

        boolean isPasswordFalse = true;
        int counter = 0;
        do{
            System.out.println("Sifre Giriniz: ");
            String input = scanner.nextLine();

            if(password.equals(input)){
                System.out.println("Bu dogru bir sifre.");
                isPasswordFalse = false;

            } else {
                System.out.println("Sifreniz yanlis.");
                isPasswordFalse = true;
                counter++;
            }

        }while(counter<3);
    }
}
