package Week_3.Generics;

import javax.swing.*;

public class Generics_Main {
    public static void main(String[] args) {
        Box<String> stringbox = new Box<>();
        stringbox.setContent("Hello world");

        Box<Boolean> booleanbox1 = new Box<>();
        booleanbox1.setContent(true);


        Box<Animal> animalBox = new Box<>();
        Animal animal = new Animal();
        animalBox.setContent(animal);


        //------------------------------

        String array[] = {"java","Python", "C++" , "Javascript"};

        Integer array2[] = {1,2,3,4,6};

        Generic_Method.printArray(array2);

         int array3[] = {1,2,3,4,5};

       // Generic_Method.printArray(array3);  int kullanimi hatalidir wrapper class olmali.

        Bounded_generic_example<Animal> s = new Bounded_generic_example<Animal>();







    }
}
