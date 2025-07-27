package Week_2.OOP.Polymorphism;

import java.util.Scanner;

public class ShapeAreaCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which shape's would you like to calculate?");
        System.out.println("1.Circle \n 2.Square \n 3.Triangle");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice){
            case 1:
                System.out.println("Enter the Circle s radius length: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;

            case 2:
                System.out.println("Enter the Square s side length: ");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;


            case 3:
                System.out.println("Enter the Triangle side length: ");
                double sideTr = scanner.nextDouble();
                System.out.println("Enter the Triangle heights length: ");
                double height = scanner.nextDouble();
                shape = new Triangle(sideTr,height);
                break;

            default:
                System.out.println("Wrong choice.");

        }
        double calculatedArea = shape.calculateArea();

        System.out.println("Alan: " + calculatedArea);
    }
}
