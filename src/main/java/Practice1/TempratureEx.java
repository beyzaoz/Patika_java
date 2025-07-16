package Practice1;

import java.util.Scanner;

public class TempratureEx {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Celcius Degree: ");
        double celc = scanner.nextDouble();

        //F = (C*1.8) +32

        double Fah = celc*(1.8) + 32;
        System.out.println(Fah);

    }
}
