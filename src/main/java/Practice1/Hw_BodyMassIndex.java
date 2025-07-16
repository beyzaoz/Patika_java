package Practice1;

import java.util.Scanner;

public class Hw_BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your height (Ex: 1.76): ");
        double height = scanner.nextDouble();

        System.out.println("Enter your weight : ");
        int weight = scanner.nextInt();

        double mass = weight/(height * height);

        System.out.println("Your Body Mass Index is " + mass);
    }
}
