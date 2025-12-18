package number;

import java.util.Scanner;

public class Single {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		
		int n=scanner.nextInt();
		
		if(n<9) {
			System.out.println("this is single digit :");
		}
		else {
			System.out.println("this is not single digit : ");
		}
	}

}
