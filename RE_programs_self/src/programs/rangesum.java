package programs;

import java.util.Scanner;

public class rangesum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enetr the number : ");
		int st=scanner.nextInt();
		int end=scanner.nextInt();
		int sum=0;
		for(int i=st;i<=end;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
