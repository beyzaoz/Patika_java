package Week_2;

import java.util.Scanner;

public class Parameters_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number: ");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println(ortaalamaal(first,second));


    }

    public static double ortaalamaal(double num,double num2){
        return (num+num2)/2;
    }
}
