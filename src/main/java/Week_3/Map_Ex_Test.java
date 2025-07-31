package Week_3;

import java.util.HashMap;
import java.util.Map;

public class Map_Ex_Test {
    public static void main(String[] args) {
        Map<String,Map_Ex> bookmap = new HashMap<>();
        bookmap.put("ISBN123", new Map_Ex("Clean Code","Robert Cecile Martin"));
        bookmap.put("ISBN456", new Map_Ex("Effective java", " Jashua Bloch"));

        for (Map.Entry<String,Map_Ex> a :bookmap.entrySet()){
            System.out.println("Key= " +a.getKey()+" Value= " + a.getValue());

        }

    }
}
