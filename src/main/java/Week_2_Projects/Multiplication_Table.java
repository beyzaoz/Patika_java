package Week_2_Projects;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1-10: "); //Get a number
        int input = scanner.nextInt();

        if(input<1){ // Check if it is smaller then 1
            System.out.println("Wrong number");
        } else if (input>10) { // Check if it is bigger then 10
            System.out.println("Wrong number");

        }else{
            Multipli(input); //If all conditions good calculate it. Recursive method

        }

    }

    public static void Multipli (int n){
        for(int i=1; i<=n ;i++){ //Check the column if it is 1;
            for (int j=1; j<=n; j++){ //Check the row 1*1,1*2,1*3 ...
                System.out.printf("%-4d",i*j);

            }
            System.out.println(" "); // Added for aligned the output
        }



    }
}
