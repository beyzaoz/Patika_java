package Practice1;

public class SwapNumbersEx {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("a" + ":" + a + "-" + "b" + ":" + b);

       int temp = a;
       a = b;
       b = temp;
        System.out.println("New Assign is: " + "a" + ":" + a + "-" + "b" + ":" + b);
}}
