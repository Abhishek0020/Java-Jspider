package Arraysheet;

public class PrintPrime {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		PrintPrime.prime(arr);
		
		
	}
	public static void prime(int arr[]) {
		for(int num:arr) {
			if(num<2)continue;
			boolean isPrime=true;
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime)System.out.print(num+" ");
			
		}
		
	}

}
