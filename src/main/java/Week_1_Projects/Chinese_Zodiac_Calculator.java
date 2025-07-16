package Week_1_Projects;

import java.util.Scanner;

public class Chinese_Zodiac_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your date of birth: ");
        int dbirt = scanner.nextInt();

        int x = dbirt % 12;
        switch(x){
            case 0:
                System.out.println("Your Chinese zodiac is Monkey!");
                break;

            case 1:
                System.out.println("Your Chinese zodiac is Cockerel!");
                break;

            case 2:
                System.out.println("Your Chinese zodiac is Dog!");
                break;

            case 3:
                System.out.println("Your Chinese zodiac is Pig!");
                break;

            case 4:
                System.out.println("Your Chinese zodiac is Mouse!");
                break;

            case 5:
                System.out.println("Your Chinese zodiac is Ox!");
                break;

            case 6:
                System.out.println("Your Chinese zodiac is Tiger!");
                break;

            case 7:
                System.out.println("Your Chinese zodiac is Rabbit!");
                break;

            case 8:
                System.out.println("Your Chinese zodiac is Dragon!");
                break;

            case 9:
                System.out.println("Your Chinese zodiac is Snake!");
                break;

            case 10:
                System.out.println("Your Chinese zodiac is Horse!");
                break;

            case 11:
                System.out.println("Your Chinese zodiac is Sheep!");
                break;

        }
    }
}
