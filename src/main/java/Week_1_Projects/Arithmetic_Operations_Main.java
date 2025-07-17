package Week_1_Projects;

import java.util.Scanner;

public class Arithmetic_Operations_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = scanner.nextInt();
        System.out.println("Enter b value: ");
        int b = scanner.nextInt();
        System.out.println("Enter c value: ");
        int c = scanner.nextInt();

        System.out.println("Value is: " + (a +(b*c)-b));
    }
}
