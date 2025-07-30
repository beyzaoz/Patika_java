package Week_3_Projects;

import java.util.ArrayList;
import java.util.Collections;

public class Nearest_Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(678);
        numbers.add(98);
        numbers.add(8);
        numbers.add(41);
        numbers.add(5);
        numbers.add(34);
        numbers.add(27);
        numbers.add(67);
        numbers.add(51);

       Collections.sort(numbers);

       int minFark=Integer.MAX_VALUE;
       int num = 0;
       int num2 = 0;
       for(int i = 0; i<numbers.size()-1; i++){
           int a = numbers.get(i+1)- numbers.get(i);
           if(a<minFark){
               minFark = a;
               num =numbers.get(i);
               num2= numbers.get(i+1);


           }


       }
        System.out.println("Small difference between" + num+ "and"+ num2);

    }
}
