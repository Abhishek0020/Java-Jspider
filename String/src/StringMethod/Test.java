package StringMethod;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Test {
	public static void main(String[] args) {
		String s="  java is easy  ";
		
//		String s1="java";
//		String s2="JAVA";
//		System.out.println(s.length());
//		s=s.trim();
//		System.out.println(s.length());
//		System.out.println(s1.toUpperCase());
//		System.out.println(s2.toLowerCase());
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the city name : ");
		String citynameString=scanner.nextLine();
		if(citynameString.equals("up"))
			System.out.println("kaise ho guru ...");
		else if(citynameString.equals("bihar"))
			System.out.println("kaise havua ");
		else if(citynameString.equals("banaras"))
			System.out.println("kha se gurdev");
		else 
			System.out.println("enter the valid city");
		
		
	}

}
