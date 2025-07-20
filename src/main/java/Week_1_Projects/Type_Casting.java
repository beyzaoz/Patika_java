package Week_1_Projects;

import java.util.Scanner;

public class Type_Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer number: " );
        int sayiInt = scanner.nextInt();
        System.out.println("Enter a Double number: ");
        double sayiDouble = scanner.nextDouble();


        double IntToDouble = sayiInt;

        int DoubleToInt = (int) sayiDouble;

        System.out.println("Double num is: "+ IntToDouble+ " Int num is: " + DoubleToInt);
    }
}
