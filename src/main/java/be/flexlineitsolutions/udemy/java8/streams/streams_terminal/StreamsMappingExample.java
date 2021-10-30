package be.flexlineitsolutions.udemy.java8.streams.streams_terminal;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {

	public static void main(String[] args) {

		List<String> names = StudentDatabase.getAllStudents()
				.stream()
				.collect(mapping(Student::getName, toList()));
		System.out.println(names);

		Set<String> namesSet = StudentDatabase.getAllStudents()
				.stream()
				.collect(mapping(Student::getName, toSet()));
		System.out.println(namesSet);

	}

}
