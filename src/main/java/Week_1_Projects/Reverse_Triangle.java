package Week_1_Projects;

import java.util.Scanner;

public class Reverse_Triangle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter your Number: ");

        int stairs = scanner.nextInt();


        for(int i=0;i<stairs;i++){
            int star = 2*(stairs-i)-1;//decrease the stars
            System.out.println("*".repeat(star));// repeating every time according to  int star number

        }





    }
}
