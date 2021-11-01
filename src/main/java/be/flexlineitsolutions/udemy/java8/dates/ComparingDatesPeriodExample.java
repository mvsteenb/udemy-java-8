package be.flexlineitsolutions.udemy.java8.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2021, 11, 1);
		LocalDate localDate1 = LocalDate.of(2021, 12, 31);

		Period period = localDate.until(localDate1);
		System.out.println("getDays: " + period.getDays());      // 31 - 1
		System.out.println("getMonths: " + period.getMonths());  // 12 - 11
		System.out.println("getYears: " + period.getYears());    // 2021 - 2021

		Period period1 = Period.ofDays(10);
		System.out.println("period1.getDays(): " + period1.getDays());

		Period period2 = Period.ofYears(20);
		System.out.println("period2.getYears(): " + period2.getYears());
		System.out.println("period2.toTotalMonths(): " + period2.toTotalMonths());

		Period period3 = Period.between(localDate, localDate1);
		System.out.println("Period: " + period3.getDays() + " : " + period3.getMonths() + " : " + period3.getYears());

		// Period.between(LocalTime.now(), LocalTime.now().plusHours(24)); ony compatible with dates
	}

}
