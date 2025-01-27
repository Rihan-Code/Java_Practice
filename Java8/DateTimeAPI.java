package Java8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(date);
        System.out.println(time);

        //formatting dates
        LocalDate date1 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date1.format(formatter);
        System.out.println(formattedDate);

        // zoned date time
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);
    }

    
}
