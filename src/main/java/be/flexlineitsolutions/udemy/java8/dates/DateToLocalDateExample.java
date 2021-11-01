package be.flexlineitsolutions.udemy.java8.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("date: " + date);                                                                      // Mon Nov 01 11:25:38 CET 2021
		System.out.println("date instance: " + date.toInstant());                                                 // 2021-11-01T10:25:38.399Z
		System.out.println("local date time: " + date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());  // 2021-11-01

		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Date date1 = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("date: " + date1);                                                                     // Mon Nov 01 11:29:00 CET 2021

		// sql date

		java.sql.Date date2 = java.sql.Date.valueOf(localDate);
		System.out.println("date2" + date2);

		LocalDate localDate1 = date2.toLocalDate();
		System.out.println("localDate1: " + localDate1);

	}

}
