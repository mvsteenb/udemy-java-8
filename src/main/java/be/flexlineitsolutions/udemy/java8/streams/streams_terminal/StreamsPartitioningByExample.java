package be.flexlineitsolutions.udemy.java8.streams.streams_terminal;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {

	public static void partitioningBy_1() {
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

		Map<Boolean, List<Student>> studentMap = StudentDatabase.getAllStudents().stream()
				.collect(partitioningBy(gpaPredicate));
		System.out.println(studentMap);
	}

	public static void partitioningBy_2() {
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

		Map<Boolean, Set<Student>> studentMap = StudentDatabase.getAllStudents().stream()
				.collect(partitioningBy(gpaPredicate, toSet()));
		System.out.println(studentMap);
	}

	public static void main(String[] args) {
		partitioningBy_1();
		partitioningBy_2();
	}

}
