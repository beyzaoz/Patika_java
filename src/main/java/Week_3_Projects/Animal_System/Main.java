package Week_3_Projects.Animal_System;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leo","Cat", 2,8.9);
        Animal animal2= new Animal("Max", "Dog", 5, 14.3);
        Animal animal3 = new Animal("Luna", "Rabbit", 1, 3.2);
        animal1.infos();
        animal2.infos();
        animal3.infos();

        Nurse nurse1 = new Nurse("Aydan",2000);
        Nurse nurse2 = new Nurse("Hatice", 2300);
        Nurse nurse3 = new Nurse("Sedat Ali", 2700);

        double new1= nurse1.doubleSallary();
        System.out.println( "Aydan's old sallary: "+nurse1.getSallary()+ " and new sallary: "+ new1);

        double new2= nurse2.doubleSallary();
        System.out.println("Hatice's old sallary: "+ nurse2.getSallary()+" and new sallary is "+ new2);

        double new3= nurse3.doubleSallary();
        System.out.println(nurse3.getName()+"'s old sallary: "+ nurse3.getSallary()+" and new sallary: "+ new3);



    }
}
