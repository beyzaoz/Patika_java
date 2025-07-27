package Week_2.OOP.Inheritance_Method.Example1;

public class Electronic  extends Product {

    private int warrantyPeriod;

    public Electronic() {
        super();
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }



}
