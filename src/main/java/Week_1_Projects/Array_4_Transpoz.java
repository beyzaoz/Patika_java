package Week_1_Projects;

import java.util.Scanner;

public class Array_4_Transpoz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boyutları al
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Orijinal matrisi oluştur
        int[][] matrix = new int[rows][cols];

        // Kullanıcıdan matris verilerini al
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpoz matrisi oluştur
        int[][] transpose = new int[cols][rows];

        // Transpoz işlemi
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Transpoz matrisi yazdır
        System.out.println("Transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
