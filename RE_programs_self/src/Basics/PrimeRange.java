package Basics;

public class PrimeRange {
	public static void main(String[] args) {
		PrimeRange primeRange=new PrimeRange();
		System.out.println(primeRange.isPrime(97));
	}
	public static boolean isPrime(int a) {
		int st=1;
		int end=100;
		for(int i=st;i<=end;i++) {
			for(int i1=2;i1<=a/2;i1++) {
				if(a%i1==0) {
					return false;
				}
			}
		}
		return true;
	}

}
