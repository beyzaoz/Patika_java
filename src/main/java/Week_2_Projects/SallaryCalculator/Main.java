package Week_2_Projects.SallaryCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name and Surname: ");
        String name = scanner.next();

        System.out.println("Sallary: ");
        int sallary = scanner.nextInt();

        System.out.println("WorkHours: ");
        int workH = scanner.nextInt();

        System.out.println("Hire Year: (yyyy) ");
        String hireY = scanner.next();
       //LocalDate hiringY = LocalDate.parse(hireY);//Changing String to date
        int year = Integer.parseInt(hireY);
        LocalDate hiringY = LocalDate.of(year, 1, 1);




        Employee employee= new Employee(sallary,workH,hireY,name);


        //Call Methods
        raiseSallaryCalculator(hiringY,sallary);
        bonusCalculator(workH);
        taxCalculate(sallary);

        int raisenum = raiseSallaryCalculator(hiringY, sallary);
        int bonusnum = (int) bonusCalculator(workH);
        double tax = taxCalculate(sallary);

        double  totalsalary = sallary+ raisenum + bonusnum-tax;
        double totalsalary1 = sallary+ bonusnum-tax;

        System.out.println("Name: " + name);
        System.out.println("Sallary: " + sallary);
        System.out.println("Work Hours: " + workH);
        System.out.println("Start Year: " + hireY);
        System.out.println("Raise: " +raisenum);
        System.out.println("Bonus: " + bonusnum);
        System.out.println("Tax: " + tax);
        System.out.println("Total salary with tax and bonus: " + totalsalary1);
        System.out.println("Total salary: " + totalsalary);





    }

//Methods
    private static int raiseSallaryCalculator(LocalDate hiringY, int sallary ){

        //Today that and as a year setted as a 2021.
        LocalDate today = LocalDate.of(2021,LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth());

        //got the periods
        int yearswork =Period.between(hiringY,today).getYears();


        int raise = 0;

        if (yearswork<10) {
            raise += sallary*5/100;
        }else if(yearswork> 9 && yearswork<20){
            raise+= sallary*10/100;
        }else if(yearswork>19){
            raise+= sallary*15/100;

        }

        return raise;
    }

    private static double bonusCalculator(int workH) {
        int bonus=0;

        if(workH> 40){
            bonus = (workH-40)*30;
        }

        return bonus;
    }


    private static double taxCalculate(int sallary) {
        double musttax = 0;

        if(sallary < 1000){
        }else{
            musttax += sallary*3/100;

        }
        return musttax;
    }

}
