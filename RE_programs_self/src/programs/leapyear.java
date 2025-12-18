package programs;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		int y=scanner.nextInt();
		if(y%400==0)
		{
			System.out.println("leap year :");
		}
		else if(y%100!=0 && y%4==0) {
			System.out.println("leap year : ");
		}
		else {
			System.out.println("not leap year : ");
		}
	}

}
