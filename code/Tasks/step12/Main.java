package Tasks.step12;

import java.util.HashSet;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        program.createTwoPersonsAndAddToSet();

        //oppgave 4
        System.out.println("Oppgave 4");
        Optional<Person> bjarte = program.getSamplePerson("bjarte");
        Optional<Person> per = program.getSamplePerson("per");
        System.out.println(bjarte);
       // System.out.println(per);


        //OPPGAVE 5
        Person petter = null;
        program.addPerson(bjarte.get());
        program.addPersons();
        HashSet<Person> pers = program.getAllPersonOverAge(22);
        HashSet<Person> pers2 = program.getAllPersonOverAge(100);

        System.out.println("all ages over 22");
        for (var p : pers){
            System.out.println(p);
        }
        System.out.println("Empty list");
        for (var p : pers2){
            System.out.println(p);
        }

        //test of errors
        //program.addPerson(new Person(-12,"per"));
        //program.addPerson(new Person(2));
        // program.addPerson(petter);


    }

}
