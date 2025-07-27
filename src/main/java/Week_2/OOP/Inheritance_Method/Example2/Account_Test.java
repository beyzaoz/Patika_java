package Week_2.OOP.Inheritance_Method.Example2;

public class Account_Test {
    public static void main(String[] args) {

        Saving_Account savingAccount = new Saving_Account(500,20000);
        //savingAccount.setIra(20000);

        InvestingAccount inv = new InvestingAccount(3000);

    }
}
