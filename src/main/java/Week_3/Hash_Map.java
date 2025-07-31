package Week_3;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        Map<String,Integer>student = new HashMap<>();

        student.put("Ali",85);
        student.put("Ayse",90);
        student.put("Emir",75);
        System.out.println("Students"+student);

        System.out.println("aysenin notu: " + student.get("Ayse"));
        System.out.println("Keys: " +student.keySet());
        System.out.println("Values: " + student.values());

        student.remove("Cem");
    }
}
