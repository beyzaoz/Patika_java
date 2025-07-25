package Week_2_Projects;

import java.util.Scanner;

public class ReversedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.nextLine();

        String reverse = "";

        String Result = Reverse(str,reverse);

        System.out.println("Reverse is: " +Result);






    }

    public static String Reverse (String str, String reverse) {
        for(int i = str.length()-1; i>= 0; i--){

            reverse += str.charAt(i);
        }

        return reverse;

    }
}
