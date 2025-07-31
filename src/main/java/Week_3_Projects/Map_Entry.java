package Week_3_Projects;

import Week_3.Hash_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Entry {
    public static void main(String[] args) {
        Map<String,Integer> Values = new HashMap<>();
        for (int i =0;i<5;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please add a movie: ");
            String name = scanner.nextLine();
            System.out.println("Please add a year: ");
            int year = Integer.parseInt(scanner.nextLine());

            Values.put(name,year);

        }

        for(Map.Entry<String,Integer> a :Values.entrySet()){
            System.out.println(a);
        }




    }

}
