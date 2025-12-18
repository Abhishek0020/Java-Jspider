package Inheritance;

public class shirt extends men {
	
	String color="red";
	void shirtlook() {
		System.out.println("shirt is looking red : ");
	}
	public static void main(String[] args) {
		shirt shirt=new shirt();
		System.out.println(shirt.color);
		System.out.println(shirt.gender);
		System.out.println(shirt.login);
		System.out.println(shirt.pass);
		shirt.shirtlook();
		shirt.login();
	}

}
