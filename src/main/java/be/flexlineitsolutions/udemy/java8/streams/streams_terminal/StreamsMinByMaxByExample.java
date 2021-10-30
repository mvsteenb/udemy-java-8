package be.flexlineitsolutions.udemy.java8.streams.streams_terminal;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class StreamsMinByMaxByExample {

	public static Optional<Student> minBy_example() {
		return StudentDatabase.getAllStudents()
				.stream()
				.collect(minBy(Comparator.comparing(Student::getGpa)));
	}

	public static Optional<Student> maxBy_example() {
		return StudentDatabase.getAllStudents()
				.stream()
				.collect(maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {
		System.out.println(minBy_example());
		System.out.println(maxBy_example());
	}

}
