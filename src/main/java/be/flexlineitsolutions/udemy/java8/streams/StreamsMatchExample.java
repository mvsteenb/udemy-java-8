package be.flexlineitsolutions.udemy.java8.streams;

import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

public class StreamsMatchExample {

	public static boolean allMatch() {
		return StudentDatabase.getAllStudents().stream()
				.allMatch(student -> student.getGpa() >=1.9);
	}

	public static boolean anyMatch() {
		return StudentDatabase.getAllStudents().stream()
				.anyMatch(student -> student.getGpa() >=4.0);
	}

	public static boolean noneMatch() {
		return StudentDatabase.getAllStudents().stream()
				.noneMatch(student -> student.getGpa() >=4.1);
	}

	public static void main(String[] args) {
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(noneMatch());
	}

}
