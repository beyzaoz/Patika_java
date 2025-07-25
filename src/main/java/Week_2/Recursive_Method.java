package Week_2;

public class Recursive_Method {
    public static void main(String[] args) {


        System.out.println(factorial(5));

    }

    public static int factorial(int num){ //recursive method
        if(num == 0){
            return 1;
        }

        return num*factorial(num-1);



    }
}
