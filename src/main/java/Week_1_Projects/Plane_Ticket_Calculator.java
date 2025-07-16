package Week_1_Projects;

import java.util.Scanner;

public class Plane_Ticket_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your distance (km): ");
        double distance = scanner.nextDouble();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Please choose: One way ( 1)  or Round trip (2) : ");
        int trip = scanner.nextInt();



        if(distance > 0 && age > 0 ){
          double rprice =distance *(0.10);
          if(age<12){
              double age12 = rprice-(rprice*0.5);
              switch(trip){
                  case 1:
                      System.out.println("Your price is: " + age12);
                      break;

                  case 2:
                      System.out.println("Your price is" + ((age12*2)-(age12*0.2)));
                      break;

                  default:
                      System.out.println("Wrong information..");
                      break;
              }

          }else if(age>12 && age<24){
              double age12_24 = rprice-(rprice*0.1);
              switch(trip){
                  case 1:
                      System.out.println("Your price is: " + age12_24);
                      break;

                  case 2:
                      System.out.println("Your price is" + ((age12_24*2)-(age12_24*0.2)));
                      break;

                  default:
                      System.out.println("Wrong information..");
                      break;
              }
          }
          else if(age>65){
              double age65 = rprice - (rprice*0.3);
              switch(trip){
                  case 1:
                      System.out.println("Your price is: " + age65);
                      break;

                  case 2:
                      System.out.println("Your price is" + ((age65*2)-(age65*0.2)));
                      break;

                  default:
                      System.out.println("Wrong information..");
                      break;
              }
          }

        }
    }


}
