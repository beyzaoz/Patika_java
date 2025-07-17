package Week_1_Projects;

import java.util.Scanner;

public class Cashier_Program {
    public static void main(String[] args) {
        /** Meyve	Fiyat (TL/kg)
        Armut	    2.14
        Elma	    3.67
        Domates  	1.11
        Muz	        0.95
        Patlıcan	5.00  **/

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many kg  for pear? : ");
        double pear = scanner.nextDouble();
        System.out.println("How many kg  for apple? : ");
        double apple = scanner.nextDouble();
        System.out.println("How many kg  for Tomatoe? : ");
        double tomatoe = scanner.nextDouble();
        System.out.println("How many kg  for banana? : ");
        double banana = scanner.nextDouble();
        System.out.println("How many kg  for eggplant? : ");
        double eggplant = scanner.nextDouble();

        //Check if is there any negative value.

        if(pear <0|| apple <0 || tomatoe<0|| banana <0 || eggplant<0){

            System.out.println("It is negative value!!.");

        }
        //If there is no negative value, calculate the total.
        else{
            double total = (pear * 2.14) +(apple * 3.67) +(tomatoe * 1.11) +(banana * 0.95) +(eggplant * 5);
            System.out.println("Your total iss: " + total );
        }


    }
}
