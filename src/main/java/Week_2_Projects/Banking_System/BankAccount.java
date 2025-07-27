package Week_2_Projects.Banking_System;

import java.util.Currency;

public class BankAccount {
    private String accountNumber;
    private  double balance;
    private CurrencyType currency;//There is no CurrencyType and we will create enum.


    public BankAccount(String accountNumber, double balance, CurrencyType currency) {

        if(balance<=0){
            System.out.println("You can not create account, because your balance is negative.");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println(currency+" "+ amount);
        }else{
            System.out.println("Not Valid Amount");
        }


    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", currency=" + currency +
                '}';
    }
}
