package be.flexlineitsolutions.udemy.java8.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

	public static void parseLocalDate() {
		String date = "2018-04-28";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate: " + localDate);

		LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDate1: " + localDate1);

		String date1 = "20180428";
		LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("localDate2: " + localDate2);

		String date2 = "2018|04|28";
		LocalDate localDate3 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy|MM|dd"));
		System.out.println("localDate3: " + localDate3);
	}

	public static void formatLocalDate() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate now = LocalDate.now();
		String format = now.format(dateTimeFormatter);
		System.out.println(format);
	}

	public static void main(String[] args) {
		parseLocalDate();
		formatLocalDate();
	}

}
