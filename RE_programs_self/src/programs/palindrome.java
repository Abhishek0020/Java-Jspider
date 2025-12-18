package programs;

import java.util.Scanner;

public class palindrome {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("eneter the number : ");
		int n=scanner.nextInt();
		int temp=n;
		int rev=0;
		
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		if(temp==n)
			System.out.println("plaindrome number :");
		else 
			System.out.println("not palindrome number : ");
	}
}
