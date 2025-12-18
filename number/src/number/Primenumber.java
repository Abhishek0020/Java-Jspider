package number;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=scanner.nextInt();
		int backup=n;
		
		boolean flag=true;
		if(n<=1) {
			System.out.println("not prime number : ");
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
				
			}
			if(flag==true) {
				System.out.println("prime number ");
			}
			else {
				System.out.println("not a prime number : ");
			}
		}
	}

}
