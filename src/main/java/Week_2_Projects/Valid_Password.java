package Week_2_Projects;

import java.util.Scanner;

public class Valid_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Password");
        var password = scanner.nextLine();

        // Determine  Conditions
        boolean charnum = password.length() >=8;
        boolean Notinclude =!password.contains(" ");
        boolean fisrtUpperC = Character.isUpperCase(password.charAt(0));
        boolean lastchar = password.charAt(password.length()-1) == '?';

        //check the conditions
        if (charnum && Notinclude && fisrtUpperC && lastchar){
            System.out.println("Volid Password");

        }else{
            System.out.println("Not a volid password. Please check the conditions.");
        }





    }
}
