package Assignment12Apr;

@FunctionalInterface 
interface I{
	boolean isPrime(int n);
}
public class Prime {
	public static void main(String[] args) {
	
		I i1=n->{
			if(n<=1) {
				return false;
			}
			else {
				for(int i=2;i<=n/2;i++) {
					if(n%i==0)
						return false;
					
				}
				return true;
				
			}
			
		};
		System.out.println(i1.isPrime(2));
	}

}
