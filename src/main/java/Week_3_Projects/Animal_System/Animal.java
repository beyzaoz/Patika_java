package Week_3_Projects.Animal_System;

public class Animal {
    public String name;
    public String species;
    public int age;
    public double weight;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal (String name, String species,int age, double weight){
        this.name=name;
        this.age = age;
        this.species=species;
        this.weight = weight;
    }

    public String infos(){
        String info = "Name: "+ name + ", Species: " + species + ", Age: " + age + ", Weight: " +weight;
        System.out.println(info);
        return info;
    }




    @Override
    public String toString(){
        return "Name: "+ name + "Species: " + species + "Age: " + age + "Weight: " +weight;
    }


}
