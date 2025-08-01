package Week_3_Projects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CharFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String input = scanner.nextLine();

        charFilter(input);

    }

    public static void charFilter (String input){
        String[] splitted = input.split("");
        Map<String,Integer> charList = new HashMap<>();
        int count=0;
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};




        for (int i = 0 ; i< splitted.length; i++){
            String c = splitted[i];

            if(c.equals(" ")|| containsAny(c,numbers)== true ){
                continue;
            } else{
                if(charList.containsKey(c)){
                    charList.put(c,charList.get(c)+1);
                } else{
                    charList.put(c,1);

                }


            }


        }

        for(String s : charList.keySet()){
            System.out.println(s + " = " +charList.get(s));
        }
    }

    public static boolean containsAny(String c, String[] numbers){
        for(String numcheck : numbers){
            if(c.contains(numcheck)){
                return true;
            }
        }
        return false;

    }

}
