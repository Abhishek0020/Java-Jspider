	package number;
	
	
	
	public class sumNum {
		public static void main(String[] args) {
			int n=1234;
			int sum=0;
			while(n>0) {
				int r=n%10;
				sum=sum+r;
				n=n/10;
			}
			System.out.println(sum);
			
		}
	
	}
