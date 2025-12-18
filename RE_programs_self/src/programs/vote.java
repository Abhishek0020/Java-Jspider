package programs;

import java.util.Scanner;

public class vote {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the age : ");
		int age=scanner.nextInt();
		if(age>=18) {
			System.out.println("eligible for vote : ");
		}
		else {
			System.out.println("not eligible for vote : ");
		}
	}

}
