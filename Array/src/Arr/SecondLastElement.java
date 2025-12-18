package Arr;

public class SecondLastElement {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		if(a.length>=2) {
			int secondLast=a[a.length-2];
			System.out.println(secondLast);
			
		}
		else {
			System.out.println("array doesnt have second last elements elements : ");
		}
	}

}
