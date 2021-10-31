package be.flexlineitsolutions.udemy.java8.parallelstream;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

	public static List<String> sequentialPrintStudentActivities() {
		long startTime = System.currentTimeMillis();
		List<String> res = StudentDatabase.getAllStudents()
				.stream()                                       // stream <Student>
				.map(Student::getActivities)                    // stream <List<String>>
				.flatMap(List::stream)                          // stream <String>
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration to execute the pipeline in sequential : " + (endTime-startTime));
		return res;
	}

	public static List<String> parallelPrintStudentActivities() {
		long startTime = System.currentTimeMillis();
		List<String> res = StudentDatabase.getAllStudents()
				.stream()                                      // stream <Student>
				.parallel()
				.map(Student::getActivities)                   // stream <List<String>>
				.flatMap(List::stream)                         // stream <String>
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration to execute the pipeline in parallel : " + (endTime-startTime));
		return res;
	}

	public static void main(String[] args) {
		sequentialPrintStudentActivities();
		parallelPrintStudentActivities();
	}

}
