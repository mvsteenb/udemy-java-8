package be.flexlineitsolutions.udemy.java8.optional;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.Optional;

public class OptionalExample {

	public static String getStudentName() {
		Student student = StudentDatabase.studentSupplier.get();
		if (student != null) {
			return student.getName();
		}

		return null;
	}

	public static Optional<String> getStudentNameOptional() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
		//Optional<Student> studentOptional = Optional.ofNullable(null);
		if (studentOptional.isPresent()) {
			return studentOptional.map(Student::getName);  // Optional<String>
		}
		return Optional.empty();
	}

	public static void main(String[] args) {

		String name = getStudentName();
		if (name != null) {
			System.out.println("Length of the student name : " + name.length());
		}
		else {
			System.out.println("Name not found !");
		}

		Optional<String> studentNameOptional = getStudentNameOptional();
		if (studentNameOptional.isPresent()) {
			System.out.println("Length of the student name : " + studentNameOptional.get().length());
		}
		else {
			System.out.println("Name not found !");
		}

	}

}
