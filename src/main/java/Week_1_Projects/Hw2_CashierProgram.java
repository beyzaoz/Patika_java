package Week_1_Projects;

import java.util.Scanner;

public class Hw2_CashierProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many kg do you need Pear: ");
        int pear = scanner.nextInt();

        System.out.println("How many kg do you need Apple: ");
        int apple = scanner.nextInt();

        System.out.println("How many kg do you need Tomatoe: ");
        int tomat = scanner.nextInt();

        System.out.println("How many kg do you need Banana: ");
        int banana = scanner.nextInt();

        System.out.println("How many kg do you need Eggplant: ");
        int eggpl = scanner.nextInt();

        double total = (pear * 2.14) + (apple * 3.67) + (tomat * 1.11)+ (banana * 0.95) + (eggpl*5.00);

        System.out.println("Total: "+ total);





    }
}
