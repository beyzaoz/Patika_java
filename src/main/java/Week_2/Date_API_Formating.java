package Week_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date_API_Formating {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println(today.format(dateTimeFormatter));

        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        String strdate = "25/01/2026";

        DateTimeFormatter formatla = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate formett = LocalDate.parse(strdate,formatla);

        System.out.println(formett);


        System.out.println(LocalDate.parse("2025-03-05"));


        LocalDateTime now =LocalDateTime.now();


        System.out.println(now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        LocalDateTime auslocal = ZonedDateTime.now(ZoneId.of("Australia/Sydney")).toLocalDateTime();


    }
}
