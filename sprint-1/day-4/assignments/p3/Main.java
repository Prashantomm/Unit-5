package com.masai.p3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Prashant", 25, 50000.0));
        personList.add(new Person("Sushant", 35, 60000.0));
        personList.add(new Person("Subham", 40, 75000.0));
        personList.add(new Person("Akash", 28, 55000.0));
        personList.add(new Person("Naveen", 32, 65000.0));
        personList.add(new Person("Shyam", 45, 90000.0));
        personList.add(new Person("Susheel", 38, 80000.0));
        personList.add(new Person("Vineet", 29, 57000.0));
        personList.add(new Person("Anand", 42, 85000.0));
        personList.add(new Person("Ravish", 31, 63000.0));

        List<String> sortedNames = personList.stream()
                .filter(person -> person.getAge() >= 30)
                .map(Person::getName)
                .skip(3)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println("Sorted Names: " + sortedNames.toString());
    }

}
