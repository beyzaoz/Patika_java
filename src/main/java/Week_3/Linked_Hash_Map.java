package Week_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hash_Map {
    public static void main(String[] args) {
        Map<String,String> countries = new LinkedHashMap<>();
        countries.put("TR","TURKIYE");
        countries.put("USA","UNITED STATE OF AMERICA");
        countries.put("DE","GERMANY");

        System.out.println("Countrie: " +countries);

        System.out.println(countries.get("TR"));

        countries.remove("DE");
        countries.put("FR","FRANCE");
        System.out.println("Countrie: " +countries);

    }



}
