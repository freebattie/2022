package LectureCode.Session6.src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public void runExample()
    {
        String localDateStr1 = "2022-01-22";

        LocalDate localDate1 = LocalDate.parse(localDateStr1);
        System.out.println("String to LocalDate1 : " + localDate1);
        LocalDate localDate2 = LocalDate.now();
        String localDateStr2 = localDate2.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println("LocalDate2 in string :  " + localDateStr2);

        LocalDate localDate3 = LocalDate.of(2020, 01, 22);
        String localDateStr3 = localDate3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("LocalDate2 in string :  " + localDateStr3);
    }
}
