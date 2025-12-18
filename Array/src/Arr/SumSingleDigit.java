package Arr;

public class SumSingleDigit {
	public static void main(String[] args) {
		int a[]= {53,55,57,10,1};
		int[] output = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            output[i] = reduceToSingleDigit(a[i]);
        }

        // Print output array
        for (int num : output) {
            System.out.print(num + " ");
        }
		
	}
	public static int  reduceToSingleDigit(int num) {
		while(num>=10) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		num=sum;
		}
		return num;
	}

}
