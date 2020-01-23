package app.filereader.utils;

import app.filereader.models.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Parser {
    public Person parseRow(String row) {
        String[] cells = null;
        if (row.contains("|")) {
            System.out.println(row);
            cells = row.split("\\|");
            System.out.println(Arrays.toString(cells));
            return new Person(
                    cells[0].trim(),
                    cells[1].trim(),
                    cells[2].trim(),
                    cells[3].trim(),
                    cells[4].trim());
        } else if (row.contains(",")) {
            cells = row.split(", ");
            return new Person(
                    cells[0].trim(),
                    cells[1].trim(),
                    cells[2].trim(),
                    cells[3].trim(),
                    cells[4].trim());
        } else {
            cells = row.split(" ");
            return new Person(
                    cells[0].trim(),
                    cells[1].trim(),
                    cells[3].trim(),
                    cells[4].trim(),
                    cells[5].trim(),
                    cells[2].trim());
        }
    }

    public List<Person> sortType1(List<Person> collection) {
        Collections.sort(collection, Comparator.comparing(Person::getGender).
                thenComparing(Person::getLastName));
        return collection;
    }

    public List<Person> sortType2(List<Person> collection) {
        Collections.sort(collection, Comparator.comparing(Person::getDOB).
                thenComparing(Person::getLastName));
        return collection;
    }

    public List<Person> sortType3(List<Person> collection) {
        Collections.sort(collection, Comparator.comparing(Person::getLastName));
        Collections.reverse(collection);
        return collection;
    }

}
