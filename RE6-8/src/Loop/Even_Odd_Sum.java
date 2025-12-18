package Loop;

public class Even_Odd_Sum {
	public static void main(String[] args) {
		Even_Odd_Sum even_Odd_Sum=new Even_Odd_Sum();
		
		even_Odd_Sum.sum(12345);
	}
	public static void sum(int n) {
		
		int esum=0;
		int osum=0;
		while(n>0) {
			if(n%2==0)
				esum=esum+n%10;
			else 
				osum=osum+n%10;
			
			n=n/10;
			
	
		}
		System.out.println("osum is :"+osum);
		System.out.println("esum is : "+esum);
	}

}
