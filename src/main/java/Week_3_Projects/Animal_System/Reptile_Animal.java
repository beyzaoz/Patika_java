package Week_3_Projects.Animal_System;

public class Reptile_Animal extends Animal {
    public boolean poisen;

    public Reptile_Animal(boolean poisen){
        this.poisen=poisen;
    }

    public boolean isPoisen() {
        return poisen;
    }

    public void setPoisen(boolean poisen) {
        this.poisen = poisen;
    }

    @Override
    public String toString() {
        return "Reptile_Animal{" +
                "poisen=" + poisen +
                '}';
    }
}
