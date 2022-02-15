package Tasks.mytasks;

import java.util.ArrayList;

public class Files {
    class Person{
        private final String name ;
        private int age;
        private String Nation;

        public Person(String name, int age, String nation) {
            this.name = name;
            this.age = age;
            Nation = nation;
        }

    }
   public abstract class FileReader{

        String text;

        abstract void open(String fileName);
        abstract String readValue(int object,int item);// finn objekt nummer og hent verdi fra objekt nummer 1,2 osv (bjarte,21)
        abstract void editValue(int object, int item);
        abstract Person getObject(int object);
        abstract ArrayList<Person> getAllObjects();

    }
    public class pdfReader extends FileReader{


        @Override
        void open(String fileName) {

        }

        @Override
        String readValue(int object, int item) {
            return null;
        }

        @Override
        void editValue(int object, int item) {

        }

        @Override
        Person getObject(int object) {
            return null;
        }

        @Override
        ArrayList<Person> getAllObjects() {
            return null;
        }
    }
    /*
     * For filer med ,
     * bjarte,21,Norge
     * odin,22,Norge
     *
     * */
    public class excelReader extends FileReader{


        @Override
        void open(String fileName) {

        }

        @Override
        String readValue(int object, int item) {
            return null;
        }

        @Override
        void editValue(int object, int item) {

        }

        @Override
        Person getObject(int object) {
            return null;
        }

        @Override
        ArrayList<Person> getAllObjects() {
            return null;
        }
    }
    public static void main(String[] args) {

    }

    // for filer som har format
    /*
    * Bjarte
    * 21
    * Norge
    * ---
    * Odin
    * 22
    * Norge
    * OSV
    * */



}
