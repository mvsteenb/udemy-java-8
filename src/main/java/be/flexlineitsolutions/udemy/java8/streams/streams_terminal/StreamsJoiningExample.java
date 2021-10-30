package be.flexlineitsolutions.udemy.java8.streams.streams_terminal;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

	public static String joining_1() {
		return StudentDatabase.getAllStudents().stream()
				.map(Student::getName)
				.collect(joining());
	}

	public static String joining_2() {
		return StudentDatabase.getAllStudents().stream()
				.map(Student::getName)
				.collect(joining("-"));
	}

	public static String joining_3() {
		return StudentDatabase.getAllStudents().stream()
				.map(Student::getName)
				.collect(joining("-", "(", ")"));
	}

	public static void main(String[] args) {
		System.out.println(joining_1());
		System.out.println(joining_2());
		System.out.println(joining_3());
	}

}
