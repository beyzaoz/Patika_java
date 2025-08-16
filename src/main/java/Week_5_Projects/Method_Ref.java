package Week_5_Projects;

import java.util.ArrayList;
import java.util.List;

public class Method_Ref {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ahmet");

        names.add("Ayşe");

        names.add("Mehmet");

        names.add("Zeynep");
//Method Ref ile liste eleman yazdirma yontemi

        names.forEach(System.out::println);

// Geleneksel yöntemle liste elemanlarını yazdırma



       /** for (String name : names) {

            System.out.println(name);

        }*/

    }
}
