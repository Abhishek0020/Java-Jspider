package TWO_D;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the row size :");
		int row=scanner.nextInt();
		System.out.println("enter the col size : ");
		int col=scanner.nextInt();
		
		//creating the 2 d array---
		int a[][]=new int[row][col];
		System.out.println("enter the element: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=scanner.nextInt();
			}	
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();	
		}	
	}
}
