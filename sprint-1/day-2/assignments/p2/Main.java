package com.masai.p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Marks: ");
            int marks = sc.nextInt();

            students.add(new Student(rollNo, name, marks));
        }

        Consumer<List<Student>> studentConsumer = studentList -> {
            Map<String, List<Student>> result = new HashMap<>();
            List<Student> failedStudents = new ArrayList<>();
            List<Student> passStudents = new ArrayList<>();
            List<Student> topperStudents = new ArrayList<>();

            for (Student student : studentList) {
                if (student.getMarks() < 165) {
                    failedStudents.add(student);
                } else if (student.getMarks() >= 165 && student.getMarks() < 400) {
                    passStudents.add(student);
                } else {
                    topperStudents.add(student);
                }
            }

            result.put("Fail", failedStudents);
            result.put("Pass", passStudents);
            result.put("Topper", topperStudents);

            System.out.println("Students categorized based on marks:");
            for (String category : result.keySet()) {
                System.out.println(category + ":");
                for (Student student : result.get(category)) {
                    System.out.println(student);
                }
                System.out.println();
            }
        };

        studentConsumer.accept(students);

        sc.close();
    }

}
