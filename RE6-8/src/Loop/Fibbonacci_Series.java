package Loop;

public class Fibbonacci_Series {
	public static void main(String[] args) {

		Fibbonacci_Series fibbonacci_Series=new Fibbonacci_Series();
		fibbonacci_Series.fibbo(10);
		
	}
	public static void fibbo(int n) {
		
		 int a=0;
		 int b=1;
		 int sum=0;
		 
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;	
		}
		
	}
	

}
