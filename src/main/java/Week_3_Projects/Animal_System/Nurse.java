package Week_3_Projects.Animal_System;

public class Nurse {
    public String name;
    private double sallary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public Nurse(String name, double sallary){
        this.name=name;
        this.sallary =sallary;

    }

    public double doubleSallary(){
        double newsal = sallary*2;
        System.out.println(newsal);
        return newsal;
    }



    @Override
    public String toString(){
        return "Name: "+ name + "Sallary: " + sallary;
    }

}
