package Week_3;

import java.sql.SQLOutput;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<Integer,String> numbers = new TreeMap<>();
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(1, "One");
        numbers.put(5, "five");
        System.out.println(numbers);
        System.out.println(numbers.firstKey());
        System.out.println(numbers.lastKey());
        System.out.println(numbers.firstEntry());
        System.out.println(numbers.containsKey(6));




    }
}
