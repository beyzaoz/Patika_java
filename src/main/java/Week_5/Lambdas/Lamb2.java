package Week_5.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lamb2 {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("turtle",false,true));
       // print(animals, new CheckIfHoper());
       // print(animals, new CheckIfSwim());

        print(animals, a -> a.canHope());
        print(animals, a -> !a.canSwim());
        print(animals, b -> b.canSwim());
    }

    private static void print(List<Animal> animalList,CheckTrait checkTrait){
        for (Animal animal: animalList){
            if (checkTrait.test(animal)){
                System.out.println(animal+ " ");
            }
        }

    }
}
