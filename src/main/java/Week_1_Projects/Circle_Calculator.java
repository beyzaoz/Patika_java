package Week_1_Projects;

import java.util.Scanner;

public class Circle_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin yaricapini girin: ");
        double radius = scanner.nextDouble();

        double PI= Math.PI;
        double area = PI *radius *radius;
        double circumference = 2*PI*radius;

        System.out.println("Cevresi "+ circumference  + " Alani " + area );

    }
}
