
//important ----
package com;

public class Sumofnum {
	public static void main(String[] args) {
		String s="Ram@123";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				sum+=ch-'0';
			
		}
		System.out.println("sum of the number is : "+sum);
		
	}
	

}
