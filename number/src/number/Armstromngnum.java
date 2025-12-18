package number;

import java.util.Scanner;

public class Armstromngnum {
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter thenumber : ");
	int n=scanner.nextInt();
	int temp=n;
	int sum=0;
	while(n>0) {
		int r=n%10;
		n=n/10;
		sum=sum+r*r*r;
		
	}
	if(temp==sum) {
		System.out.println("armstrong ");
	}
	else {
		System.out.println("not armstrong number : ");
	}
	}

}
