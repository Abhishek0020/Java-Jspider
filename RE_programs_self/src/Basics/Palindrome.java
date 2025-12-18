package Basics;

public class Palindrome {
	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		
		System.out.println(palindrome.ispalindrome(121));
	}
	public static boolean ispalindrome(int n) {
		int temp=n;
		int rev=0;
		  while(n>0) {
			  int r=n%10;
			  rev=rev*10+r;
			  n=n/10;
			 
		  }  
		  
		  if(temp==rev) 
		  return true;
		  return false;
		  
	}

}
