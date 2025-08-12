package Week_5_Projects.Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Day: ");
        String dayinput = s.nextLine().toUpperCase();

        //Changed the string to int for compare
        Days guns = Days.valueOf(dayinput);

        if (guns.getday() >= 2 && guns.getday() <= 5){
            System.out.println("Work Hours: 9am to 5pm");
        }else{
            System.out.println("it is a Holiday");
        }
    }
}
