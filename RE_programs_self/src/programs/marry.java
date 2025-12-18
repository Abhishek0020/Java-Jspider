package programs;

import java.util.Scanner;

public class marry {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the age for marry a girl : ");
		int age=scanner.nextInt();
		if(age>=26 && age<=32) {
//			if(age<=32) {
//				System.out.println("eligible for married : ");
//			}
			System.out.println("eligible for marry : ");
		}
		else {
			System.out.println("not eligiblr for marry : ");
		}
	}
}
