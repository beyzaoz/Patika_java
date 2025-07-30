package Week_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_List {

    public static void main(String[] args) {

        //New ArrayList created
        ArrayList<Integer> integers = new ArrayList<>(30); //30 is the capacity

        ArrayList<Integer> integers1 = new ArrayList<>(); //We caan write like this too.

        //Every ArrayList ois the LIST,


        List<String> stringsname = new ArrayList<>();

        stringsname.add("Banana");
        stringsname.add("Apple");
        stringsname.add(1,"Mango"); // Assigned to the index one otherwise it will add by order.
        for (String s : stringsname) {
            System.out.println(s);

        }

        boolean isAppleRemoved = stringsname.remove("Apple");
        System.out.println("isAppleRemoved "+isAppleRemoved);

        stringsname.remove("Apple");
        System.out.println(stringsname);

        ArrayList<String> string2 = new ArrayList<>();
        string2.add("Milk");

        string2.addAll(stringsname);
        System.out.println(stringsname);

        System.out.println(string2.contains("Milk"));

        System.out.println(string2.size());

        System.out.println("LinkedList");
        LinkedList<String> linkedList = new LinkedList<>();
        List<String> names = new LinkedList<>();
        names.add("cem");
        names.add("patika");
        names.add("java kursu");

        System.out.println(names);

        for(String liste : names){
            System.out.println(liste);
        }



    }
}
