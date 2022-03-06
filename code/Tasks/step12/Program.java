package Tasks.step12;

import java.util.HashSet;
import java.util.Optional;

public class Program {
    HashSet<Person> persons = new HashSet<>();

    public void createTwoPersonsAndAddToSet(){
        Person person1 = new Person(21,"bjarte");
        Person person2 = new Person(21,"bjarte");

        persons.add(person1);
        persons.add(person2);

        System.out.println(persons);
    }
    public void addPersons(){
        persons.add(new Person(38,"bjarte"));
        persons.add(new Person(21,"per"));
        persons.add(new Person(26,"petter"));
        persons.add(new Person(31,"kari"));
        persons.add(new Person(22,"laila"));
        persons.add(new Person(18,"trude"));
        persons.add(new Person(41,"Eva"));
        persons.add(new Person(24,"stine"));
        persons.add(new Person(23,"martine"));
        persons.add(new Person(33,"kari"));



    }
    public Optional<Person> getSamplePerson(String name){

        for (Person person : persons){

            if (person.getName().equalsIgnoreCase(name))
                return Optional.of(person);

        }
        return Optional.empty();
    }
    public HashSet<Person> getAllPersonOverAge(int age){
        HashSet<Person> pers = new HashSet<>();
        for (Person person : persons){

            if (person.getAge() > age)
                pers.add(person);

        }
        return pers;
    }

    public void addPerson(Person p) {
        //validate
        if (p == null)
            throw new NullPointerException("Variable is set to null");
        if(p.getAge() < 0)
            throw new ArithmeticException("only positive values allowed");
        if (p.getName() == null)
            throw new NullPointerException("name is null");
        //add if validation passes
        persons.add(p);
    }
}
