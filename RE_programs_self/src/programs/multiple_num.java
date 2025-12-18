package programs;

public class multiple_num {
	
	public static void main(String[] args) {
		int n=1234;
		int res=1;
		while(n>0) {
	
			res*=n%10;
			n=n/10;
			
		}
		System.out.println(res);
	}

}
