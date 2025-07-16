package Week_1_Projects;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adinizi Giriniz: ");
        String name = scanner.nextLine();

        System.out.println("Yasinizi giriniz: ");
        int age = scanner.nextInt();
        System.out.println("Merhaba " + name + "," + age + " yasindasin");
        scanner.close();

    }
}
