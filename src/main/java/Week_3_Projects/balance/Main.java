package Week_3_Projects.balance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please see options below:");
        System.out.println("1: Deposit ");
        System.out.println("2: Credit");
        System.out.println("3: Balance ");
        int choice = s.nextInt();
        BankAccount Ali = new BankAccount("Ali",3000.89);

        switch(choice){
            case 1:
                Ali.paraYatir(Ali,1000.98);
                System.out.println( Ali.getBalance());
                break;
            case 2:
                Ali.paracekme(Ali,1236.09);
                System.out.println( Ali.getBalance());
                break;
            case 3:
                System.out.println( Ali.getBalance());
                break;

        }
    }




}
