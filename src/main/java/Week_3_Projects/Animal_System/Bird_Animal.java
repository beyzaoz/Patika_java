package Week_3_Projects.Animal_System;

public class Bird_Animal extends Animal {
    public double wingspan;

    public Bird_Animal(double wingspan){
        this.wingspan=wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Bird_Animal{" +
                "wingspan=" + wingspan +
                '}';
    }
}
