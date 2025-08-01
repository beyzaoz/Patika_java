package Week_3.Generics;

public class Generic_Method {

    public static <T> void printArray(T[] array){
        for(T element:array){
            System.out.println(element);
        }
    }
}
