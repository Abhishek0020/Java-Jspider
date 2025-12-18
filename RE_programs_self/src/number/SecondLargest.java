package number;


import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
	if(a>b && a<c || a>c && a<b) {
		System.out.println("a is second largest : "+a);
	}
	else if(b>a && b<c || b>c && b<a) {
		System.out.println("b is second largest : "+b );
	}
	else {
		System.out.println("c is second largest :"+c);
	}
	}

}
