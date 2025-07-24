package Week_2_Projects;

import java.util.Scanner;

public class Math_Project_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Number: ");

        double number = scanner.nextDouble();

        System.out.println(Math.round(number));

        System.out.println(Math.ceil(number));

        System.out.println(Math.floor(number));
    }
}
