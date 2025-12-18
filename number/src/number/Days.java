package number;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the days in number 1 to 7 ");
		int day=scanner.nextInt();
		
		switch(day) {
		case 1: System.out.println("monday");
		         break;
		case 2: System.out.println("tuesday ");
		        break;
		case 3: System.out.println("tuesday");
		        break;
		case 4: System.out.println("wednesday");
		        break;
		case 5: System.out.println("thurs day");
				break;
		case 6: System.out.println("friday");
		        break;
		case 7: System.out.println("saturday");
		        break;
		default:System.out.println("invalid i/p");
				break;
		  
		} 
	}
}
