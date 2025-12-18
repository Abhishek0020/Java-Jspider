package number;

//import java.util.Scanner;

public class Armstrong{
	
	public static void main(String[] args) {
		int number=153;
		int temp=number;
	 
	    int sum=0;
	    while (number>0){
	     int  rem=number%10;
	      number=number/10;
	      sum=sum+rem*rem*rem;
	    }  
	    if (temp==sum)
	      System.out.println("yes armastrong : ");
	    else
	      System.out.println(" not armastrong : ");
	
	
		
		
		
		
		
	}
		
		
	}

