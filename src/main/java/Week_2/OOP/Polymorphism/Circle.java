package Week_2.OOP.Polymorphism;

public class Circle extends  Shape {

    private double cap;

    public Circle(double cap) {
        this.cap = cap;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(cap,2);
    }


}
