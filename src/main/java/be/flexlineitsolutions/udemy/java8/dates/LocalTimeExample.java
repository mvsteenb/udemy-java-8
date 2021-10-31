package be.flexlineitsolutions.udemy.java8.dates;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: " + localTime);

		LocalTime.of(16, 10);
	}

}
