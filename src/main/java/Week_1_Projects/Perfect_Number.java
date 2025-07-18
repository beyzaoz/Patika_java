package Week_1_Projects;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        int num = scanner.nextInt();
        int sum = 0; //Bolenleri toplayacagimiz bir bos kutu
        int i = 1;
        while(i<num){ //num hariç tüm pozitif sayılarla kontrol yapılır.
            if(num%i==0){
                sum+=i; // kendisi hariç pozitif bölenleri topla
            }
            i++;
        }

            if(sum==num){
                System.out.println("It is perfect number.");
            }else {
                System.out.println("It is not a perfect number");
            }


        }


    }

