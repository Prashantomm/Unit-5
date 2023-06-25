package com.masai.p4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Prashant", 18, 85.5));
        students.add(new Student("Subham", 21, 75.0));
        students.add(new Student("Akash", 19, 90.0));
        students.add(new Student("Naveen", 17, 95.5));
        students.add(new Student("Tony", 20, 82.0));
        students.add(new Student("Hank", 22, 78.5));
        students.add(new Student("Spidy", 19, 88.0));
        students.add(new Student("Bruce", 18, 92.5));
        students.add(new Student("Stanlee", 20, 81.0));
        students.add(new Student("Navya", 19, 87.5));

        Predicate<Student> agePredicate = student -> student.getAge() < 20;
        Predicate<Student> gradePredicate = student -> student.getGrade() >= 80;

        printStudents(students, agePredicate, gradePredicate);
    }

    public static void printStudents(List<Student> students, Predicate<Student> agePredicate,
                                     Predicate<Student> gradePredicate) {
        Consumer<Student> studentConsumer = student -> System.out.println(
                "Name: " + student.getName() +
                ", Age: " + student.getAge() +
                ", Grade: " + student.getGrade()
        );

        for (Student student : students) {
            if (agePredicate.and(gradePredicate).test(student)) {
                studentConsumer.accept(student);
            }
        }
    }

}
