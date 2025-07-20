package Week_1_Projects;

import java.util.Scanner;

public class Multi_Dimension_Array_2 {
    public static void main(String[] args) {
        int[][] matrix  = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int input = scanner.nextInt();
        for(int i= 0; i<matrix.length;i++){
            for(int j = 0; j< matrix[i].length;j++){
                if (input == matrix[i][j]){
                    System.out.println("Included.");
                    break;

                }else{
                    System.out.println("Not Included.");

                }

            }
        }
    }
}
