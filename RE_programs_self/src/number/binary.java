package number;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		int bin=1001;
		int dec=0;
		int i=1;
		while(bin>0) {
			int bit=bin%10;
			dec +=(bit*i);
			i*=2;
			bin=bin/10;
			
		}
		System.out.println(dec);
	}
}
