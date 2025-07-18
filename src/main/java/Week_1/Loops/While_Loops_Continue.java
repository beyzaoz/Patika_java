package Week_1.Loops;

public class While_Loops_Continue {
    public static void main(String[] args) {
        int i = 0;
        int sum =0;

        while(i<100){
            if(i % 5 == 0){

                System.out.println(i+" Degeri hesaba dahil degil.");
                i++;
                continue;
            }
            sum +=i;
            i++;


        }
        System.out.println("Toplam: " +sum);
    }
}
