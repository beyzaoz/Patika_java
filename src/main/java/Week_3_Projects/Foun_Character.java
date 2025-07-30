package Week_3_Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Foun_Character {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        ArrayList<String> inputList = new ArrayList<>(); //Created a new array list


        System.out.println("Enter your character: ");
        inputList.add(s.nextLine()); //added inputs

        System.out.println("Enter your character: ");
        inputList.add(s.nextLine());

        System.out.println("Enter your character: ");
        inputList.add(s.nextLine());

        System.out.println("Enter your character: ");
        inputList.add(s.nextLine());

        Checking(inputList);





    }
  //new method created and checking if it is include.
    public static ArrayList<String> Checking (ArrayList<String> inputList){
        ArrayList<String> arrList = new ArrayList<>(); //new array list
        //assigned 4 value
        arrList.add("a");
        arrList.add("b");
        arrList.add("c");
        arrList.add("h");
  //checking with loop it is include or not
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
