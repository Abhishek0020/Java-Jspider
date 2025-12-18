package Inheritance;

public class pent extends men {

	String color="blue";
	void pentlook() {
		System.out.println("pent is looking good ");
	}
public static void main(String[] args) {
	pent pent=new pent();
	
	System.out.println(pent.color);
	System.out.println(pent.login);
	System.out.println(pent.pass);
	pent.login();
	pent.pentlook();
}
}
