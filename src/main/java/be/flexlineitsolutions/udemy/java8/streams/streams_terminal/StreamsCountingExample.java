package be.flexlineitsolutions.udemy.java8.streams.streams_terminal;

import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

	public static long count() {
		return StudentDatabase.getAllStudents()
				.stream()
				.filter(student -> student.getGpa() >= 3.9)
				.collect(counting());
	}

	public static void main(String[] args) {
		System.out.println(count());
	}

}
