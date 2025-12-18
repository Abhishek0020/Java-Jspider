package Arr;

import java.util.Scanner;

public class Plaayer {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of the array : ");
		int size=scanner.nextInt();
		
		String name[];
		name=new String[size];
		
		for(int i=0;i<=size-1;i++) {
			
			System.out.println("enter the name : ");
			name[i]=scanner.next();
			
		}
		for(int i=0;i<=size-1;i++) {
			System.out.println(name[i]);
			
		}
		System.out.println("------------------------------");
		for(int i=size-1;i>=0;i--) {
			System.out.println(name[i]);
		}
		
	}

}
