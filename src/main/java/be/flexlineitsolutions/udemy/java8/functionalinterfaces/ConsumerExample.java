package be.flexlineitsolutions.udemy.java8.functionalinterfaces;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	static Consumer<Student> c1 = (s) -> System.out.println(s.toString());
	static Consumer<Student> c2 = (s) -> System.out.print(s.getName());
	static Consumer<Student> c3 = (s) -> System.out.println(s.getActivities());

	static void printName() {
		System.out.println("\nprintName: ");
		List<Student> students = StudentDatabase.getAllStudents();
		students.forEach(c1);
	}

	public static void printNameAndActivities() {
		System.out.println("\nprintNameAndActivities: ");
		List<Student> students = StudentDatabase.getAllStudents();
		students.forEach(c2.andThen(c3));                             // consumer chaining !
	}

	public static void printNameAndActivitiesUsingCondition() {
		System.out.println("\nprintNameAndActivitiesUsingCondition: ");
		List<Student> students = StudentDatabase.getAllStudents();
		students.forEach(student -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				c2.andThen(c3).accept(student);
			}
		});
	}

	public static void main(String[] args) {
		Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
		c.accept("java 8");

		printName();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();

	}

}
