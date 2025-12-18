package DateAndtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
	public static void main(String[] args) {
		LocalDate a=LocalDate.now();
		System.out.println(a);//2025-04-16
		LocalTime b=LocalTime.now();
		System.out.println(b);//21:05:40.838326500
		LocalDateTime c=LocalDateTime.now();
		System.out.println(c);//2025-04-16T21:06:20.030246700
		LocalDate d=LocalDate.parse("2025-04-16");
		System.out.println(d);//2025-04-16
	}

}
