package be.flexlineitsolutions.udemy.java8.dates;

import java.time.*;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime: " + zonedDateTime);         // 2021-11-01T10:45:22.651677800+01:00[Europe/Brussels]
		System.out.println("offset: " + zonedDateTime.getOffset());    // +01:00
		System.out.println("zone ID: " + zonedDateTime.getZone());     // Europe/Brussels

		System.out.println("Available zones: ");
		ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

		System.out.println("Total number of zones: " + ZoneId.getAvailableZoneIds().size());

		// CST,EST,MST,PST
		System.out.println("Chicago CST: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Detroit CST: " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("LA PST: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("Denver MST: " + ZonedDateTime.now(ZoneId.of("America/Denver")));

		System.out.println("ZoneDateTime using clock: "  + ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));

		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
		System.out.println("Detroit: " + localDateTime);                                  // 2021-11-01T05:53:03.914978400

		LocalDateTime localDateTime2 = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
		System.out.println("Detroit: " + localDateTime2);                                 // 2021-11-01T05:53:03.914978400

		//
		// convert from LocalDateTime, Instant to ZonedDateTime and Time

		System.out.println("---");

		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println("localDateTime1: " + localDateTime1); // 2021-11-01T11:04:14.110342200

		System.out.println("atZone: " + localDateTime1.atZone(ZoneId.of("America/Chicago"))); // 2021-11-01T11:04:14.110342200-05:00[America/Chicago]
		System.out.println("Time in Detroit: " + Instant.now().atZone(ZoneId.of("America/Detroit")));

		OffsetDateTime offsetDateTime = localDateTime1.atOffset(ZoneOffset.ofHours(-6));
		System.out.println("offsetDateTime: " + offsetDateTime);  // offsetDateTime: 2021-11-01T11:22:12.469335500-06:00
	}

}
