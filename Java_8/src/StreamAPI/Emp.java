package StreamAPI;

public class Emp {
	String name;
	int age;
	char gender;
	
	public Emp(String name,int age,char gender) {
		 this.name=name;
		 this.age=age;
		 this.gender=gender;
	}
	public String toString() {
		return "name : "+name+" age : "+" gender : "+gender;
	}
}
