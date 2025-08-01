package Week_3;

import java.util.List;

public class Wild_Card {
    public static void main(String[] args) {
        List<Integer> integerlist = List.of(1, 2, 3);
        List<String> stringList = List.of("Java", "Python");

    }

    public static void print(List<?> list){
        for(Object o : list){
            System.out.println(o);

        }
    }
}
