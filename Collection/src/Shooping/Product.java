package Shooping;

public class Product {
	
	private int id;
	private String name;
	private double prize;
	public Product(int id,String name,double prize) {
		this.id=id;
		this.name=name;
		this.prize=prize;	
	}
	
	public int getid() {
		return id;
	}
	
	public String getname() {
		return name;
	}
	
	public double getprize() {
		return prize;
	}
	
	public String toString() {
		return "id :"+id+" name : "+name+" prize : "+prize;
	}
}
