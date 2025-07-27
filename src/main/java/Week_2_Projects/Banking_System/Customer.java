package Week_2_Projects.Banking_System;

public class Customer {
    public String name;
    public String surname;
    public String phone;
    private String password;
    private String identity;
    private BankAccount[] bankAccounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Customer(String name, String surname, String phone, String password, String identity) {

        if(password.length()<8 && password.length()>=12){
            System.out.println("Your password must be at least 8 charactr and max 12 charactr.");
        }else {
            this.name = name;
            this.surname = surname;
            this.phone = phone;
            this.password = password;
            this.identity = identity;
            bankAccounts = new BankAccount[4];
            System.out.println("Customer created." + this);

        }
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
