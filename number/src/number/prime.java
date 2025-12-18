package number;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=scanner.nextInt();
		boolean flag=true;
		if(n==1) {
			System.out.println("not a prime : ");
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("prim");
			}
			else {
				System.out.println("not a prime ");
			}
		}
	}
	
}
