package number;

public class harshad {
	public static void main(String[] args) {
		int n=18;
		int temp=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		if(temp%sum==0) {
			System.out.println("harshad ");
		}
		else {
			System.out.println("not harsad number : ");
		}
	}

}
