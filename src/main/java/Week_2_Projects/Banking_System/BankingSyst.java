package Week_2_Projects.Banking_System;

import java.util.Arrays;
import java.util.Scanner;

public class BankingSyst {
    private static Customer[] customer = new Customer[10];
    public static void main(String[] args) {

        Customer cust = new Customer("Elif","Ak","5556784323","12345elif","ID123");
        customer[0]= cust;
        menu();


    }

    private static void menu(){
        Scanner scanner = new Scanner(System.in);
        validatePassword();
        int choice;

        do{
            System.out.println("----Banking System-----");
            System.out.println("Please choose: ");
            System.out.println("1- Open new account");
            System.out.println("2- Order accounts ");
            System.out.println("3- Choose an account and perform ");
            System.out.println("4- Log out");

            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter an amount: ");
                    double amount =  scanner.nextDouble();
                    System.out.println("Enter an Currency : 1- TL, 2-Dolar, 3-Euro, 4-Altin ");
                    int curencychoise = scanner.nextInt();



                    CurrencyType currencyType = switch(curencychoise){
                        case 1 -> CurrencyType.TL;
                        case 2 -> CurrencyType.DOLLAR;
                        case 3 -> CurrencyType.EURO;
                        case 4 -> CurrencyType.GOLD;
                        default-> {
                            System.out.println("Invalid choise. ");
                            yield  CurrencyType.TL; // If choose different(not in the list) CurrencyType. As a default yield will processed.
                        }
                    };
                    String customerName = customer[0].getName();
                    String accountNumber = customerName.charAt(0) + " - " +customerName.length()+ curencychoise ;

                    BankAccount bankAccount = new BankAccount(accountNumber,amount,currencyType);

                    customer[0].getBankAccounts()[0] = bankAccount;
                  //  System.out.println(" Your account is active "+ customer[0].getBankAccounts()+" amount: " +amount+currencyType );
                    System.out.println(" Your account is active "+ Arrays.toString(customer[0].getBankAccounts())+" amount: " +amount+currencyType );


            }

        }while(choice!=0);
        System.out.println("Thank you!!");






    }

    private static void validatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + customer[0].getName() + ", ");

        int wrongPassw=0;

        do {

            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            if (!customer[0].getPassword().equals(password)) {
                System.out.println("Wrong Password!!");
                wrongPassw++;


            }
            break;

        }while(wrongPassw++ < 4);
    }
}
