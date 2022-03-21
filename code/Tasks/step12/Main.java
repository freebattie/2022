package Tasks.step12;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Optional;



public class Main {

    public static void countUp(int x){
        if (x == 0)
            System.out.println("Starting to count up");
        else{
             countUp(x-1);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {

        countUp(10);

        Program program = new Program();
        program.createTwoPersonsAndAddToSet();










        ArrayList<String> names = new ArrayList<>();// lager en tom liste
        StorageClass store = new StorageClass(names);//legger til tom liste i første classen


        store.addNames("per");// legger til en person i listen
        store.addNames("martin");// legger til enda en person i listen
        ArrayList<String> newlist = store.getNames();// henter ut alle personer i listen til store objektet
        newlist.clear(); // tømmer listen du hentet ut men tømmer også listen inne i store

        // proøver å hente ut navne "per" fra listen på index 0, programme vill krasje siden du brukte newlist.clear();
        //xSystem.out.println(store.getNameAtIndex(0));







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

        //Overloading
        int intval =  program.add(2,3);
        float floatval = program.add(2.0f,3.3f);
        double doubleval = program.addT(2.4d,2.44444d);

        //generic type 1;

        double val = program.addT(2d,3f);
        double val2 = program.addT(3,2);

        //generic type 2;
        float verid1 = program.addT2(3f,3f);
        int verid2 = program.addT2(3,3);
        double verdi3 = program.addT2(3d,4d);


    }


}

