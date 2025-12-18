package Arr;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the user size of array : ");
		
		int size=scanner.nextInt();
		//static way to declare of the array-->
		int age[]=new int[size];
		
		//take the user input age using scanner class-----------
		for(int i=0;i<age.length;i++) 
		{
			System.out.println("enter the age : ");
			age[i]=scanner.nextInt();
		}
		
		//print the age in forward order------------------
		System.out.println("-----------------------------------------------");
		for(int i=0;i<age.length;i++) 
		{
			System.out.println("print the age in forword order :--->"+age[i]);
		}
		
		//print the age in reverse order-----------
		System.out.println("----------------------------------------------");
		for(int i=age.length-1;i>=0;i--)
		{
			System.out.println("age in reverse order :"+age[i]);
		}
	}
}
