package Week_3_Projects.balance;

public class BankAccount {
    public String name;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;

    }
    public double paraYatir(BankAccount account, double amount){
        if(amount<0){
            System.out.println("Wrong amount!");
        }else{
            System.out.println("Added Successfully!");
            double yenibakiye = account.getBalance()+amount;
            account.setBalance(yenibakiye);

        }

        return account.getBalance();
    }

    public double paracekme(BankAccount credit,double amount){
        if(credit.getBalance()<amount){
            System.out.println("Please check your balance.");
        }
        else{
            System.out.println("Successfull.");
            double yenib = credit.getBalance()-amount;
            credit.setBalance(yenib);
        }
        return credit.getBalance();
    }

    @Override
    public String toString(){
        return "name: " + name + "Balance is: " + balance;

    }
}
