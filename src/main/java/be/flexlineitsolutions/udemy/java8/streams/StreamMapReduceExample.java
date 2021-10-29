package be.flexlineitsolutions.udemy.java8.streams;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

public class StreamMapReduceExample {

	private static int noOfNoteBooks() {
		int noOfNoteBooks = StudentDatabase.getAllStudents().stream()   // Stream<Student>
				.filter(student -> student.getGradeLevel() >= 3)
				.filter(student -> student.getGender().equals("female"))
				.map(Student::getNoteBooks)                                   // Stream<Integer>
				//.reduce(0, (a,b) -> a+b);
				.reduce(0, Integer::sum);
		return noOfNoteBooks;
	}

	public static void main(String[] args) {
		System.out.println("noOfNoteBooks: " + noOfNoteBooks());
	}

}
