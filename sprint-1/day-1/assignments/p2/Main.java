package com.masai.p2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void findStudentWithSameState(List<Student> result, List<? extends Student> students1,
            List<? extends Student> students2, String state) {
for (Student student : students1) {
if (student instanceof SchoolStudent && student.getState().equals(state)) {
result.add(student);
}
}

for (Student student : students2) {
if (student instanceof CollegeStudent && student.getState().equals(state)) {
result.add(student);
}
}
}

public static void main(String[] args) {
List<SchoolStudent> schoolStudents = new ArrayList<>();
schoolStudents.add(new SchoolStudent(1,  "ABC", "Delhi", "CBSE"));
schoolStudents.add(new SchoolStudent(2, "BCD", "Pune", "ICSE"));
schoolStudents.add(new SchoolStudent(3, "CDE", "UP", "State Board"));
schoolStudents.add(new SchoolStudent(4, "DEF", "MP", "State Board"));
schoolStudents.add(new SchoolStudent(5, "EFG", "Hariyana", "CBSE"));

List<CollegeStudent> collegeStudents = new ArrayList<>();
collegeStudents.add(new CollegeStudent(101, "FGH", "Delhi", "DU"));
collegeStudents.add(new CollegeStudent(102, "GHI", "Delhi", "JNU"));
collegeStudents.add(new CollegeStudent(103,"HIJ", "Pune", "AU"));
collegeStudents.add(new CollegeStudent(104, "IJK", "UP", "LU"));
collegeStudents.add(new CollegeStudent(105, "JKL", "UP", "PSU"));

List<Student> students = new ArrayList<>();
findStudentWithSameState(students, schoolStudents, collegeStudents, "Pune");

for (Student student : students) {
System.out.println(student);
}
}

}
