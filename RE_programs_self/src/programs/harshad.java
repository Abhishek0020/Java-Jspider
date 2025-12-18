package programs;

import java.util.Scanner;

public class harshad {
	
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("eneter the nmber : ");
	int n=scanner.nextInt();
	int temp=n;
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		sum=sum+r;
		n=n/10;
	}
		if(temp%sum==0) {
			System.out.println("harshad number : ");
		}
		else {
			System.out.println("this is not harshad number : ");
		}
	}


}
