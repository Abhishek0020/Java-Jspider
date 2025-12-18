package programs;

import java.util.Scanner;

public class fibbonacci {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=scanner.nextInt();
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
			
		}
	}

}
