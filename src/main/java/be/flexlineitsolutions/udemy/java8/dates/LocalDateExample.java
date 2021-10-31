package be.flexlineitsolutions.udemy.java8.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {



	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate: " + localDate);

		localDate = LocalDate.of(1978, 6, 8);
		System.out.println("localDate: " + localDate);

		localDate = LocalDate.ofYearDay(1981, 2);
		System.out.println("localDate: " + localDate);             // 1981-01-02

		System.out.println("getMonth: " + localDate.getMonth());
		System.out.println("getMonthValue: " + localDate.getMonthValue());
		System.out.println("getDayOfWeek: " + localDate.getDayOfWeek());
		System.out.println("getDayOfYear: " + localDate.getDayOfYear());

		System.out.println("Day of month using get: " + localDate.get(ChronoField.DAY_OF_MONTH));

		//
		// modifying local date

		System.out.println("plusDays: " + localDate.plusDays(2));
		System.out.println("plusMonths: " + localDate.plusMonths(2));
		System.out.println("minusDays: " + localDate.minusDays(2));
		System.out.println("withYear: " + localDate.withYear(2019));

		System.out.println("withYear: " + localDate.with(ChronoField.YEAR, 2016));
		System.out.println("TemporalAdjusters: " + localDate.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("ChronoUnit minus: " + localDate.minus(1, ChronoUnit.YEARS));

		System.out.println("leapyear: " + LocalDate.ofYearDay(2020, 1).isLeapYear());
		System.out.println("isEqual: " + LocalDate.ofYearDay(2020, 1).isEqual(localDate));
		System.out.println("isBefore: " + LocalDate.ofYearDay(2020, 1).isBefore(localDate));
		System.out.println("isAfter: " + LocalDate.ofYearDay(2020, 1).isAfter(localDate));


	}

}
