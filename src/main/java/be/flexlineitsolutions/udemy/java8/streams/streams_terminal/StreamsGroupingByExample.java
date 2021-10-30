package be.flexlineitsolutions.udemy.java8.streams.streams_terminal;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

	public static void groupStudentsByGender() {
		Map<String, List<Student>> studentMap = StudentDatabase.getAllStudents().stream()
				.collect(groupingBy(Student::getGender));
		System.out.println(studentMap);
	}

	public static void customizedGroupBy() {
		Map<String, List<Student>> studentMap = StudentDatabase.getAllStudents().stream()
				.collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
		System.out.println(studentMap);
	}

	public static void twoLevelGrouping_1() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDatabase.getAllStudents().stream()
				.collect(
						groupingBy(
								Student::getGradeLevel,
								groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")
						)
				);
		System.out.println(studentMap);
	}

	public static void twoLevelGrouping_2() {
		Map<Integer, Integer> studentMap = StudentDatabase.getAllStudents().stream()
				.collect(
						groupingBy(
								Student::getGradeLevel,
								summingInt(Student::getNoteBooks)
						)
				);
		System.out.println(studentMap);
	}

	public static void twoLevelGrouping_3() {
		Map<String, Integer> studentMap = StudentDatabase.getAllStudents().stream()
				.collect(
						groupingBy(
								Student::getName,
								summingInt(Student::getNoteBooks)
						)
				);
		System.out.println(studentMap);
	}

	public static void threeArgumentGroupBy() {
		LinkedHashMap<String, Set<Student>> studentMap = StudentDatabase.getAllStudents().stream()
				.collect(
						groupingBy(
								Student::getName,
								LinkedHashMap::new,
								toSet()
						)
				);
		System.out.println(studentMap);
	}

	public static void calculateTopGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDatabase.getAllStudents().stream()
				.collect(
						groupingBy(
								Student::getGradeLevel,
								maxBy(Comparator.comparing(Student::getGpa))
						)
				);
		System.out.println(studentMapOptional);


		Map<Integer, Student> studentMapOptional2 = StudentDatabase.getAllStudents().stream()
				.collect(
						groupingBy(
								Student::getGradeLevel,
								collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)
						)
				);
		System.out.println(studentMapOptional2);
	}

	public static void calculateLeastGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDatabase.getAllStudents().stream()
				.collect(
						groupingBy(
								Student::getGradeLevel,
								minBy(Comparator.comparing(Student::getGpa))
						)
				);
		System.out.println(studentMapOptional);


		Map<Integer, Student> studentMapOptional2 = StudentDatabase.getAllStudents().stream()
				.collect(
						groupingBy(
								Student::getGradeLevel,
								collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)
						)
				);
		System.out.println(studentMapOptional2);
	}



	public static void main(String[] args) {
		groupStudentsByGender();

		System.out.println("---");
		customizedGroupBy();

		System.out.println("---");
		twoLevelGrouping_1();

		System.out.println("---");
		twoLevelGrouping_2();

		System.out.println("---");
		twoLevelGrouping_3();

		System.out.println("---");
		threeArgumentGroupBy();

		System.out.println("---");
		calculateTopGpa();

		System.out.println("---");
		calculateLeastGpa();
	}


}
