package DateAndTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
	public static void main(String[] args) {
		ZonedDateTime a=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(a);
		ZonedDateTime b=ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(b);
		
	}

}
