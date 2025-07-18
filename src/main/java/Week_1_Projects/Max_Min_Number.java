package Week_1_Projects;

import java.util.Scanner;

public class Max_Min_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get input for how many number will enter?

        System.out.println("HOW MANY NUMBER WILL YOU ENTER? ");
        int hmnum = scanner.nextInt();

        //Take the first value for compare
        System.out.println( "1. Value: ");
        int val = scanner.nextInt();
        int min = val;
        int max = val;


        //Create a loop for other values with for loop
        for(int i=2; i<=hmnum;i++){
            System.out.println( i + ". Value: ");
            val = scanner.nextInt(); //no need int because already determined on above.

            if(val>max){  //If value is bigger than max num assign value as a max
                max = val;
            } else if(val<min){  //If value is smaller than min num assign value as a min
                min = val;
            }


        }
        System.out.println("Biggest num is " + max);
        System.out.println("Smallest num is " + min);

    }
}
