package com.Encapsulation;

public class Cal {
	String brand;
	int cost;
	String Colour;
	
	public Cal(String brand,int cost,String Colour) {
		this.brand=brand;
		this.cost=cost;
		this.Colour=Colour;
		
		
	}
	public static void main(String[] args) {
		Cal c1=new Cal("bmw",100000,"black");
		Cal c2=new Cal("tata", 500000, "red");
		System.out.println(c1);
	}
	@Override
	public String toString() {
		return brand+"brand " +cost+" "+" "+Colour;
	}
}	
