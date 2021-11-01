package be.flexlineitsolutions.udemy.java8.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {

		Instant instant = Instant.now();
		System.out.println(instant); // 2021-11-01T09:38:35.744059300Z

		// number of seconds from Jan 1st 1970 -> Epoch - 86400 seconds (by day)
		System.out.println("getEpochSecond: " + instant.getEpochSecond());

		System.out.println(Instant.ofEpochSecond(0)); // 1970-01-01T00:00:00Z

		Instant instant1 = Instant.now();
		Duration between = Duration.between(instant, instant1);
		System.out.println("time elapsed: " + between.getNano() + " nanoseconds");
	}

}
