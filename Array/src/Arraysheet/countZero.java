package Arraysheet;

public class countZero {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,0,1,0,1,0};
		int count=0;
		for(int num:arr) {
			
			if(num==0)count++;
		}
		System.out.println(count);
	}

}
