package Week_1_Projects;

import java.util.Scanner;

public class Body_Mass_Index {
    public static void main(String[] args)
    {
       //Get Input

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Weight (kg): ");
        double w = scanner.nextDouble();
        System.out.println("What is your Height (m): ");
        double h = scanner.nextDouble();

        double result = result(w,h);

        System.out.println("Your Body Mass Index is: " + result);

    }

    public static double result (double w, double h){
        double result = w/(h*h);
        return (float) result;
    }
}
