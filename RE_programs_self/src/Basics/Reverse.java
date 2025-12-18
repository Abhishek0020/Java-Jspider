package Basics;

public class Reverse {
	public static void main(String[] args) {
		Reverse reverse=new Reverse();
		reverse.rev(1234);
	}
	public static void rev(int n) {
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		System.out.println(rev);
	}

}
