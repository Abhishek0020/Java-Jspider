package number;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		
		int n=scanner.nextInt();
		int backup=n;
		int rev=0;
		
		
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(backup==rev) {
			System.out.println("palindrme number : ");
		}
		else {
			System.out.println("not a palindrome number : ");
		}
		
	}
}
