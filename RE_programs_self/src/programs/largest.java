package programs;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter  number :");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if(a>b && a>c)
			System.out.println("a is geatest : ");
		else if(b>a && b>c)
			System.out.println("b is gratest : ");
		else 
			System.out.println("c is greatest : ");
	}
}
