package number;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=scanner.nextInt();
		if(n%2==0) {
			System.out.println("even number ");
		}
		else {
			System.out.println("odd number : ");
		}
	}

}
