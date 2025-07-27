package Week_2.OOP.Polymorphism;

public class Triangle  extends  Shape{

    private double sideTr;
    private double height;

    public Triangle(double side, double height) {
        this.sideTr = side;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (sideTr * height)/2;
    }
}
