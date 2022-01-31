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
    Artist(){

    }
    Artist(String artistName, String dateOfBirth, String city,String country){
        this.artistName = artistName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        this.city = city;
        this.country = country;

    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
