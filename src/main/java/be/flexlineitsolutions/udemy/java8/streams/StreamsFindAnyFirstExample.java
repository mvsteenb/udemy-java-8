package be.flexlineitsolutions.udemy.java8.streams;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAnyStudent() {
		return StudentDatabase.getAllStudents().stream()
				.filter(student -> student.getGpa() > 3.9)
				.findAny();                                 // returns as soon as it finds the student with GPA > 3.9
	}

	public static Optional<Student> findFirstStudent() {
		return StudentDatabase.getAllStudents().stream()
				.filter(student -> student.getGpa() > 3.9)
				.findFirst();                                 // returns as soon as it finds the student with GPA > 3.9
	}

	public static void main(String[] args) {
		Optional<Student> anyStudent = findAnyStudent();

		if (anyStudent.isPresent()) {
			System.out.println(anyStudent.get());
		}
		else {
			System.out.println("Student not found");
		}

		Optional<Student> firstStudent = findFirstStudent();
		if (firstStudent.isPresent()) {
			System.out.println(firstStudent.get());
		}
		else {
			System.out.println("Student not found");
		}

	}

}
