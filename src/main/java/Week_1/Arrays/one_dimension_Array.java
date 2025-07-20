package Week_1.Arrays;

public class one_dimension_Array {
    public static void main(String[] args) {

        int [] number = new int[5];
        number [0] = 5;
        number [1] = 5;
        number [2] = 5;
        number [3] = 5;
        number [4] = 5;


        for(int i = 0; i<number.length; i++){
            System.out.println("Number [" + i + "]= " + number[i]);
        }


        int [] number2 = {1,2,3,4,5};

        for(int num : number2){
            System.out.println(num);

        }


        String cities [] = {"Istanbul","Ankara", "Izmir", "Bursa"};
        String [] cities2  = {"Istanbul","Ankara", "Izmir", "Bursa"};


    }
}
