package number;

public class Product {

	public static void main(String[] args) {
		int n=1234;
		int res=1;
		while(n>0) {
			int r=n%10;
			res*=r;
			n=n/10;
			
			
		}
		System.out.println("product of the number is : "+res);
	}
}
