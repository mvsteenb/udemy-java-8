package be.flexlineitsolutions.udemy.java8.defaults;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

	static Consumer<Student> studentConsumer = System.out::println;
	static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

	public static void sortByName(List<Student> students) {
		Comparator<Student> nameComparator = Comparator.nullsFirst(Comparator.comparing(Student::getName));
		students.sort(nameComparator);
		students.forEach(studentConsumer);
	}

	public static void sortByGrade(List<Student> students) {
		students.sort(Comparator.nullsFirst(nameComparator));
		students.forEach(studentConsumer);
	}

	public static void comparatorChain(List<Student> students) {
		students.sort(Comparator.nullsFirst(gradeComparator.thenComparing(nameComparator)));
		students.forEach(studentConsumer);
	}

	public static void sortWithNullValues(List<Student> students) {
		Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
		students.sort(studentComparator);
		students.forEach(studentConsumer);
	}

	public static void main(String[] args) {

		List<Student> allStudents = StudentDatabase.getAllStudents();
		System.out.println("before sorting: ");
		allStudents.forEach(studentConsumer);

		System.out.println("---");
		System.out.println("after sorting with null values: ");
		sortWithNullValues(allStudents);

		System.out.println("---");
		System.out.println("after sorting by name: ");
		sortByName(allStudents);

		System.out.println("---");
		System.out.println("after sorting by GPA: ");
		sortByGrade(allStudents);

		System.out.println("---");
		System.out.println("after comparator chaining: ");
		comparatorChain(allStudents);
	}

}
