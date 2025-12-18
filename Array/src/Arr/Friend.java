package Arr;

import java.util.Scanner;

public class Friend {
	public static void main(String[] args) {
		//take user input of the array--
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of array ");
		
	
		String name[]=new String[5];
		
		for(int i=0;i<=name.length-1;i++) {
			//take user 5 user  input of the loop 
			name[i]=scanner.nextLine();
			
		}
		System.out.println("---------------");
		System.out.println("forword loop");
		//o/p loop 
		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("reverse lop");
		System.out.println("-----------");
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(name[i]);
		}
	}

}
