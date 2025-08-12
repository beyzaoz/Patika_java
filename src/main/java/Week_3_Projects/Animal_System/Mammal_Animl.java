package Week_3_Projects.Animal_System;

public class Mammal_Animl extends Animal{
    public int BirthPeriod;

    public Mammal_Animl(int BirthPeriod){
        this.BirthPeriod = BirthPeriod;
    }

    public int getBirthPeriod() {
        return BirthPeriod;
    }

    public void setBirthPeriod(int birthPeriod) {
        BirthPeriod = birthPeriod;
    }


}
