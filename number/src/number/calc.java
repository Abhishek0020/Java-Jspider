package number;

import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("give the case :");
		int res=scanner.nextInt();
		switch(res) {
		case 1: res=a+b;
				System.out.println(res);
				break;
		case 2: res=a-b;
				System.out.println(res);
				break;
		case 3: res=a*b;
				System.out.println(res);
				break;
		case 4: res=a/b;
				System.out.println(res);
				break;
				
		default: System.out.println("invalid");
				 break;
		}
		
	}

}
