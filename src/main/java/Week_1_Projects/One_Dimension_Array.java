package Week_1_Projects;

public class One_Dimension_Array {
    public static void main(String[] args) {
        int[] numbers = {1,5,9,256,23,56,97};
        int max = numbers[0];

        for(int num : numbers){

            if (num > max){
                max = num;

            }



        }

        System.out.println("Biggest number is: " + max);
    }
}
