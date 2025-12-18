package number;

public class StrongNumber {

	
	public static int fact(int y) {
		int fact=1;
		for(int i=1;i<=y;i++) {
			fact=fact*i;
			
		}
		return fact;
		
	}
	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+"number is strong number : ");
		}
		else {
			System.out.println(temp+"not a strong number : ");
		}
	}
}
