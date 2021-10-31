package be.flexlineitsolutions.udemy.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime: " + localDateTime);

		LocalDateTime localDateTime1 = LocalDateTime.of(2021, 10, 31, 23, 54, 33, 83829038);
		System.out.println("localDateTime1: " + localDateTime1);

		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDateTime2: " + localDateTime2);

		//
		// getting the value from the LocalDateTime

		System.out.println("getHour: " + localDateTime.getHour());
		System.out.println("getMinute: " + localDateTime.getMinute());
		System.out.println("getDayOfMonth: " + localDateTime.getDayOfMonth());
		System.out.println("DAY_OF_MONTH: " + localDateTime.get(ChronoField.DAY_OF_MONTH));

		//
		// setting values on LocalDateTime

		System.out.println("plusHours: " + localDateTime1.plusHours(2));
		System.out.println("minusDays: " + localDateTime1.minusDays(2));
		System.out.println("withMonth: " + localDateTime1.withMonth(12));

		//
		// converting LocalDate, LocalTime to LocalDateTime

		LocalDate localDate = LocalDate.of(2021, 10, 10);
		LocalDateTime localDateTime3 = localDate.atTime(6, 20);
		System.out.println("atTime: " + localDateTime3);

		LocalTime localTime = LocalTime.of(23, 56);
		LocalDateTime localDateTime4 = localTime.atDate(localDate);
		System.out.println("atDate: " + localDateTime4);

		LocalDateTime localDateTime5 = localTime.atDate(localDate);
		System.out.println("toLocalDate" + localDateTime5.toLocalDate());
		System.out.println("toLocalTime" + localDateTime5.toLocalTime());
	}

}
