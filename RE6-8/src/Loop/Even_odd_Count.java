package Loop;

public class Even_odd_Count {
	public static void main(String[] args) {
		Even_odd_Count even_odd_Count=new Even_odd_Count();
		even_odd_Count.count(12345);
	}
	public static void count(int n) {
		int even=0;
		int odd=0;
//		int count=0;
		while(n>0) {
			if(n%2==0)
				even++;
			else 
				odd++;
			n=n/10;
		}
		System.out.println("even count is : "+even);
		System.out.println("odd count is : "+odd);
	}

}
