package Week_1;

public class If_Else_Main {
    public static void main(String[] args) {
        int number = 10;
        if(number > 5){
            System.out.println("Number is bigger than 5");
        } else if (number <0 ) {
            System.out.println("Number is smaller then 0");

        } else{
            System.out.println("Number is not bigger than 5");
        }

        if(number==5){
            System.out.println("Number is equal to 5");
        }
        else if(number != 5 && number > 5){

        }

        int not = 85;
        String harfnotu;
        if (not>= 85){
            harfnotu = "A";
        } else if(not>=70){
            harfnotu = "B";
        } else if(not>=60){
            harfnotu = "C";
        } else {
            harfnotu = "D";
        }


    }
}
