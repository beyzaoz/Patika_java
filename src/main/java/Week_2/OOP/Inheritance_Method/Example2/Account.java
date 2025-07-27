package Week_2.OOP.Inheritance_Method.Example2;

public abstract class Account {
    private double balance;

    public Account(double balance) {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
