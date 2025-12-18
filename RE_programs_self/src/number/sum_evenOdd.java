package number;

public class sum_evenOdd {
	public static void main(String[] args) {
		int n=1234;
		int esum=0;
		int osum=0;
		while(n>0) {
			int r=n%10;
			if(n%2==0)
				esum=esum+r;
			
			else 
				osum=osum+r;
			n=n/10;
		}
		System.out.println("esum is : "+esum);
		System.out.println("osum is "+osum);
				
		
	}

}
