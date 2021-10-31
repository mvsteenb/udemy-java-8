package be.flexlineitsolutions.udemy.java8.optional;

import be.flexlineitsolutions.udemy.java8.data.Bike;
import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

	public static void optionalFilter() {
		Optional.ofNullable(StudentDatabase.studentSupplier.get())
			.filter(s -> s.getGpa() >= 3.5)
			.ifPresent(System.out::println);
	}

	public static void optionalMap() {
		Optional.ofNullable(StudentDatabase.studentSupplier.get())
			.filter(s -> s.getGpa() >= 3.5)
			.map(Student::getName)
			.ifPresent(System.out::println);
	}

	public static void optionalFlatMap() {
		Optional.ofNullable(StudentDatabase.studentSupplier.get())
			.filter(s -> s.getGpa() >= 3.5)
			.flatMap(Student::getBike)
			.map(Bike::getName)
			.ifPresent(System.out::println);
	}
	
	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}

}
