package Week_1.Loops;

public class For_Loops_Main {
    public static void main(String[] args) {
        /**
         * for
         * foreach
         * while
         * do-while
         * **/

        int sum = 0;
        for(int i =0;i<=100;i++){
            System.out.println(i);
            sum = sum+i;

        }
        System.out.println("Toplam: " + sum);

        int result = 0;

        for (int j = 0;j<=200; j++ ){
            if(j % 5 == 0){
                System.out.println(j); // We want to see the values
                result = result + j; //sum to values
                //result+=j; //same thing with above

            }
        }
        System.out.println("Result: " +result);

    }
}
