package Week_2_Projects;

public class Calculation {
    public  void showtitle (){
        System.out.println("Welcome!");
    }
    public int calculateSquare(int number){
        int sqr =sqr = number*number;
        System.out.println("Square: " + sqr);
        return sqr;


    }

    protected void addNumber( int number1, int number2){
        int sum = number1+number2;
        System.out.println("Sum: "+sum);
    }

    private static double addNumberDouble(double number1,double number2){
        double sum = number1+number2;
        return sum;
    }


}
