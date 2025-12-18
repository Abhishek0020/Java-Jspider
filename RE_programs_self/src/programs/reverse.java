package programs;

import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number : ");
	int n=scanner.nextInt();
	int rev=0;
	while(n>0) {
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
		
	}
	System.out.println(rev);
}
}
