package be.flexlineitsolutions.udemy.java8.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

	public static void parseLocalDateTime() {
		String dateTime = "2021-11-01T14:18:22";
		LocalDateTime dateTime1 = LocalDateTime.parse(dateTime);
		System.out.println(dateTime1);

		LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(localDateTime);

		String dateTime2 = "2021-11-01T14|18|22";
		DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		LocalDateTime dateTime3 = LocalDateTime.parse(dateTime2, localDateTimeFormatter);
		System.out.println(dateTime3);
	}

	public static void formatLocalDateTime() {

	}

	public static void main(String[] args) {
		parseLocalDateTime();
		formatLocalDateTime();
	}

}
