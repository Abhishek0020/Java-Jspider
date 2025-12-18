package Arr;

public class CountZero {
	public static void main(String[] args) {
		int a[]= {1,0,2,0,3,0};
		int countzero=0;
		for(int num:a) {
			if(num==0)
			{
				countzero++;
			}
		}
		System.out.println(countzero);
	}

}
