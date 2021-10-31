package be.flexlineitsolutions.udemy.java8.optional;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.Optional;

public class OptionalOrElseExample {

	public static String optionalOrElse() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
		String name = studentOptional.map(Student::getName).orElse("Default");
		return name;
	}

	public static String optionalOrElseGet() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
		String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
		return name;
	}

	public static String optionalOrElseThrow() {
		//Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No data available") );
		return name;
	}

	public static void main(String[] args) {
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		System.out.println(optionalOrElseThrow());
	}

}
