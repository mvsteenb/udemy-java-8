package be.flexlineitsolutions.udemy.java8.streams.streams_terminal;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

	public static int sum() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));
	}

	public static double average() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.averagingInt(Student::getNoteBooks));
	}

	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(average());
	}

}
