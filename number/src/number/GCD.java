package number;

public class GCD {
	public static void main(String[] args) {
		int a=2;
		int b=4;
		int n=a>b?a:b;
		while(n>0) {
			if(a%n==0 && b%n==0) {
				System.out.println(n);
				break;
			}
			n--;
			
			
		}
	}

}
