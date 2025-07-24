package Week_2;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Local_Date_Time {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        System.out.println(LocalDate.now());


        System.out.println(LocalDate.now().plusDays(30));

        var expiredDate = LocalDate.of(2026,11,21);
        boolean isBefore = expiredDate.isBefore(LocalDate.now());

        if(isBefore){
            System.out.println("Package is expired.");

        }

        boolean after = expiredDate.plusMonths(5).isAfter(LocalDate.now());
        System.out.println(after);

    }
}
