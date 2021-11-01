package be.flexlineitsolutions.udemy.java8.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

	public static void parseTime() {
		String time = "13:00";
		LocalTime parsed = LocalTime.parse(time);
		System.out.println(parsed);

		LocalTime parsed2 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("parsed2 : " + parsed2);

		String time1 = "13*00";
		LocalTime parsed3 = LocalTime.parse(time1, DateTimeFormatter.ofPattern("HH*mm"));
		System.out.println("parsed3 : " + parsed3);
	}

	public static void formatTime() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime = LocalTime.now();
		String format = localTime.format(dateTimeFormatter);
		System.out.println(format);
	}

	public static void main(String[] args) {
		parseTime();
		formatTime();
	}

}
