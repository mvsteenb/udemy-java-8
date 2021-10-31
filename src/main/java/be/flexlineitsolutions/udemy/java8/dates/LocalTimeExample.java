package be.flexlineitsolutions.udemy.java8.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: " + localTime);

		LocalTime localTime1 = LocalTime.of(16, 10);
		System.out.println("localTime1 " + localTime1);

		LocalTime localTime2 = LocalTime.of(16, 10, 33);
		System.out.println("localTime2 " + localTime2);

		LocalTime localTime3 = LocalTime.of(16, 10, 33, 84545892);
		System.out.println("localTime3 " + localTime3);

		//
		// getting the values from local time instance

		System.out.println("getHour : " + localTime.getHour());
		System.out.println("getMinute : " + localTime.getMinute());
		System.out.println("MINUTE_OF_HOUR : " + localTime.get(ChronoField.MINUTE_OF_HOUR));
		System.out.println("toSecondOfDay : " + localTime.toSecondOfDay());

		//
		// modify the values of LocalTime

		System.out.println("minusHours: " + localTime.minusHours(2));
		System.out.println("minusHours: " + localTime.minus(2, ChronoUnit.HOURS));
		System.out.println("MIDNIGHT: " + localTime.with(LocalTime.MIDNIGHT));
		System.out.println("MINUTE_OF_HOUR: " + localTime.with(ChronoField.MINUTE_OF_HOUR, 2));
		System.out.println("plusMinutes: " + localTime.plusMinutes(2));
		System.out.println("withHour: " + localTime.withHour(3));
	}

}
