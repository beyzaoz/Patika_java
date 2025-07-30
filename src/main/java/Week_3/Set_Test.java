package Week_3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Test {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        //Not repeating

        System.out.println("Apple: "+ "Apple".hashCode()); //63476538
        System.out.println("Banana: "+"Banana". hashCode()); //1982479237
        System.out.println("Orange: "+"Orange". hashCode()); //-1924984242
        fruits.add(null);


        System.out.println(fruits);


        //LinkedHashSet

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Hatay");
        cities.add("Ankara");
        System.out.println(cities);

        //TreeSet

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        System.out.println(numbers);

        Set<String> carbrand = new TreeSet<>();
        carbrand.add("Audi");
        carbrand.add("Mercedes");
        carbrand.add("Fiat");
        System.out.println(carbrand);

        Set<String> car= new TreeSet<>();
        car.add("Audi");
        car.add("Mercedes");
        car.add("Fiat");
        System.out.println(car);
        car.clear();
        System.out.println("Cars: " + car);
        System.out.println(car.isEmpty());
















    }
}
