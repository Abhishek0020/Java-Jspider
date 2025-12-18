package demo;

public class bike  extends vehicle
{
	
	String model="cd";
	String fuel;
	String cc;
	
	public static void main(String[] args) {
		
		bike v=new bike();
		System.out.println( v.brand);
		
		
		v.start();
		v.stop();
		System.out.println(v.cost);
		System.out.println(v.model);
		System.out.println(v.cc);
		
	}
	

}
