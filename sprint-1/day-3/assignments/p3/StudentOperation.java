package com.masai.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentOperation {
	public static Optional<List<Student>> findStudent(List<Student> studentList) {
        List<Student> passedStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getMarks() >= 55) {
                passedStudents.add(student);
            }
        }
        return Optional.ofNullable(passedStudents.isEmpty() ? null : passedStudents);
		
    }

    public static int getOutstandingStudentCount(List<Student> studentList) throws NoStudentPassedException {
        List<Student> passedStudents = findStudent(studentList).orElseThrow(NoStudentPassedException::new);
        return passedStudents.size();
    }
   

}
