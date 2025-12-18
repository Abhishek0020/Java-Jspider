package number;

public class LCM {
	public static void main(String[] args) {
		int a=4;
		int b=6;
		int n=a>b?a:b;
		int temp=n;
		
		while(true) {
			if(n%a==0 && n%b==0) {
				
				break;
				
				
			}
			n=n+temp;
			System.out.println(n);
		}
	}

}
