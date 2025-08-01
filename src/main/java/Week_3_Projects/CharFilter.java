package Week_3_Projects;

import java.util.*;


public class CharFilter {
    public static void main(String[] args) {

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String input1 = scanner.nextLine();
        String input = input1.toLowerCase();


        //Calling method
        charFilter(input);

    }
  //Created a method for filtering
    public static void charFilter (String input){

        //splitted word to tha alphabetic char
        String[] splitted = input.split("");
        //created a hashmap
        Map<String,Integer> charList = new HashMap<>();
        //count forcounting how many same char we have
        int count=0;
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};




        for (int i = 0 ; i< splitted.length; i++){
            String c = splitted[i];
            //for will be return for each char

            if(c.equals(" ")|| containsAny(c,numbers)== true ){
                //If the input include space or numbers code will ignore it.

                continue;
            } else{ //characters will be return the value
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
        //this method is checking for any of the numbers include  the input
        for(String numcheck : numbers){
            if(c.contains(numcheck)){
                return true; //if includes, will return true
            }
        }
        return false;

    }

}
