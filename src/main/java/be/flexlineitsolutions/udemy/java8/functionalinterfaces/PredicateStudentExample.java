package be.flexlineitsolutions.udemy.java8.functionalinterfaces;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

	public static void filterStudentsByGradeLevel() {
		System.out.println("\nfilterStudentsByGradeLevel : ");

		List<Student> studentList = StudentDatabase.getAllStudents();

		studentList.forEach(s -> {
			if (p1.test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void filterStudentsByGpa() {
		System.out.println("\nfilterStudentsByGpa : ");

		List<Student> studentList = StudentDatabase.getAllStudents();

		studentList.forEach(s -> {
			if (p2.test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void filterStudentsByGradeLevelAndGpa() {
		System.out.println("\nfilterStudentsByGpa : ");

		List<Student> studentList = StudentDatabase.getAllStudents();

		studentList.forEach(s -> {
			if (p1.and(p2).test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void main(String[] args) {
		filterStudentsByGradeLevel();
		filterStudentsByGpa();
		filterStudentsByGradeLevelAndGpa();
	}

}
