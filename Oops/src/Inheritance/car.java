package Inheritance;

public class car extends vehicle {

	String model="breeza";
	String cc="1000";
	double cost=1500000;
	void milege() {
		System.out.println("milege is 20kmpl");
	}
	public static void main(String[] args) {
		
		car car=new car();
		System.out.println(car.model);
		System.out.println(car.cc);
		System.out.println(car.cost);
		System.out.println(car.brand);
		car.start();
		car.stop();
		
	}
	
	
	
}
