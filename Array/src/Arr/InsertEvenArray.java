package Arr;

import java.util.Scanner;

public class InsertEvenArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of elements : ");
		int num=scanner.nextInt();
		//create an array to store an elements 
		int[] evenArray=new int[num];
		int count=0;
		//take input from user :----
		System.out.println("enter : "+num+"numbers : ");
		for(int i=0;i<num;i++) {
			int value=scanner.nextInt();
			if(value%2==0) {
				evenArray[count]=value;
				count++;	
			}
		}
		//display even values : ----
		System.out.println("even number inserted in the array : ");
		for(int i=0;i<count;i++) {
			System.out.print(evenArray[i]+" ");
		}	
	}
}
