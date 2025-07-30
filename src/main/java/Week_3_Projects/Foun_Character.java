package Week_3_Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Foun_Character {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        ArrayList<String> inputList = new ArrayList<>();


        System.out.println("Enter your character: ");
        inputList.add(s.nextLine());

        System.out.println("Enter your character: ");
        inputList.add(s.nextLine());

        System.out.println("Enter your character: ");
        inputList.add(s.nextLine());

        System.out.println("Enter your character: ");
        inputList.add(s.nextLine());

        Checking(inputList);





    }

    public static ArrayList<String> Checking (ArrayList<String> inputList){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("a");
        arrList.add("b");
        arrList.add("c");
        arrList.add("h");

        int i=0;
        int j =0;

     for(String s : inputList){
         if(arrList.contains(s)){
             System.out.println(s+"Found");

         }else{
             arrList.add(s);
             System.out.println("Adding: "+ arrList);


         }
     }
     return arrList;



    }
}
