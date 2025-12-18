package programs;

import java.util.Scanner;

public class perfect {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=scanner.nextInt();
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum=sum+i;
			
		}
		if(n==sum)
			System.out.println("perfect number : ");
		else 
			System.out.println("this is not perfect number : ");
	}
}
