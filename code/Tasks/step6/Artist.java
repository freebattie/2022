package Tasks.step6;

import java.time.LocalDate;

/*
*
*
* artistName, dateOfBirth (datatype: LocalDate), city,
country. Lag en konstruktører for klassen som tar imot verdier for alle fieldsene.
*
*
* */
public class Artist {
    String artistName;
    LocalDate dateOfBirth;
    String city;
    String country;

    Artist(String artistName, LocalDate dateOfBirth, String city,String country){
        this.artistName = artistName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;

    }

    public void printInfo(){
        println("Artist : " + this.artistName);
        println("Date of Birth : " + this.dateOfBirth);
        println("City : " + this.city);
        println("Country : " + this.country);
    }

    private void println(String s) {
        System.out.println(s);
    }
    private void print(String s) {
        System.out.print(s);
    }
}
