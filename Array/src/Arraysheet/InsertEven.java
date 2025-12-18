package Arraysheet;

import java.util.Scanner;

public class InsertEven {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the array size : ");
		int size=scanner.nextInt();
		int result[]=new int[size];
		int index=0;
		for(int i=0;i<size;i++) {
			System.out.println("enter the number  : ");
			int num=scanner.nextInt();
			if(num%2==0)
				result[index++]=num;
		}
		System.out.println(result);
	}

}
