package programs;

import java.util.Scanner;

public class evenoddsum {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=scanner.nextInt();
		int esum=0;
		int osum=0;
		while(n>0) {
			int r=n%10;
			if(n%2==0) {
				esum=esum+r;
				
			}
			else {
				osum=osum+r;
			
				
			}
			n=n/10;
			
		}
		System.out.println("even sum is "+esum);
		System.out.println("odd sum is : "+osum);
			
		
		
	}

}
