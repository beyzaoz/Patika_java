package Week_2.OOP.Inheritance_Method.Example2;

public class Saving_Account extends Account{

    private double Ira;

    public double getIra() {
        return Ira;
    }

    public void setIra(double ira) {
        Ira = ira;
    }


    public Saving_Account(double balance,double Intrate){

        super(balance);
        this.Ira = Intrate;
    }





}
