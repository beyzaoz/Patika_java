package Week_3.Generics;

import java.util.List;

public class WildCardExample {
    public static double sum(List<?extends Number> list ){
        double sum = 0;
        for(Number s: list){
            sum += s.doubleValue();


        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerlist = List.of(1,2,3,4);
        List<Double> doubleList = List.of(1.5,2.5);

        System.out.println(sum(integerlist));
        System.out.println((sum(doubleList)));
    }
}
