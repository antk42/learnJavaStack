package org.example.tasks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class Task5 {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Aleshkin", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 26),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov12324", 56)
                );

        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<String>> map = persons.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));

        Map<Integer, Person> personMap = persons.stream()
                .collect(toMap(Person::getAge, Function.identity()));

        System.out.println(map);
    }
}
