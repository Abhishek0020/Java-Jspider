package number;

public class Perfectnumber {
	public static void main(String[] args) {
	
		
		int st=1;
		int end=10;
		for(int n=st;n<=end;n++) {
			int sum=0;
		
		for(int i=1;i<=n-1;i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
		}
	
		if(sum==n) {
			System.out.println(n+" is perfect number : ");
		}
	}
  }

}
