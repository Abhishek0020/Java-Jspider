package DateAndTimeApi;

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo {
	public static void main(String[] args) {
		LocalDateTime st=LocalDateTime.of(2000, 12, 24, 11, 11);
		LocalDateTime end=LocalDateTime.now();
		Duration d=Duration.between(st, end);
		System.out.println(d.toDays());//8879
		System.out.println(d.toHours());//213106
		System.out.println(d.toMinutes());//12786361
	}

}
