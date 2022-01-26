package Tasks.step6;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // oppgave 4
        Program prg = new Program();
        prg.openFIle("D:\\Skole\\java\\github\\2022\\code\\Tasks\\step6","opg4");
        prg.printFile();


        //oppgave 5
       // prg.oppgave5();

        //oppgave 6
        Artist art = new Artist("Bjarte",LocalDate.parse("1983-04-06"),"Ålesund","Norway");
        art.printInfo();


    }
}
