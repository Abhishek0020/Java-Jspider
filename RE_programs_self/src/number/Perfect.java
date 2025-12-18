package number;

import java.util.Scanner;

public class Perfect {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		
		int n=scanner.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
		}
		if(sum==n) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not");
		}
	}

}
