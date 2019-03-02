package pl.mpas.advancedprogramming.comparing;

import javax.sql.rowset.CachedRowSet;
import java.rmi.MarshalException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
          new Person("Mariusz", "P.", 20),
          new Person("Antoni", "W.", 20),
          new Person("Ola", "A.", 25)
        );


        Collections.sort(persons);
        Collections.sort(persons, Person::compareTo);
        Collections.sort(persons,(o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(persons, Comparator.comparing(Person::getSurname).thenComparing(Person::getName));

    }





}
