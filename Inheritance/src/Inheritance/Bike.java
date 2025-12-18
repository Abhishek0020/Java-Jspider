package Inheritance;

public class Bike extends vehicle {

	String model="husqvarna sqartpien ";
	String cc="401";

	double cost=350000;
	void milege() {
		System.out.println("the milege of the bike is 30kmpl");
	}
	void speed() {
		System.out.println("speed is 180kmpl");
	}
	public static void main(String[] args) {
		
		Bike bike=new Bike();
		System.out.println(bike.brand);
		System.out.println(bike.model);
		System.out.println(bike.cc);
		System.out.println(bike.cost);
		bike.start();
		bike.stop();
		bike.milege();
		bike.speed();
		
	}
}
