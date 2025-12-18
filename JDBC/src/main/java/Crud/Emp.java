package Crud;

public class Emp {
	private  int id;
	private String name;
	private int age;
	private double salary;
	
	public int getid() {
		return id;
	}
	public void setid() {
		this.id=id;
	}
	public String getname() {
		return name;
		
	}
	public  void setname(){
		this.name=name;
	}
	public int getage() {
		return age;
		
	}
	public void setage() {
		this.age=age;
	}
	public double getsalary() {
		return salary;
		
	}
	public void setsalary() {
		this.salary=salary;
	}
	
	public String toString() {
		return "id :"+id+" name : "+name+" age : "+age+" salary : "+salary;
	}

}
