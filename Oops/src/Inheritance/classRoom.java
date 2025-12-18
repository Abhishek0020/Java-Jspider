package Inheritance;

public class classRoom extends Dept {
	String classroom="101";
	void games() {
		System.out.println("games is going very nicelly : ");
	}
public static void main(String[] args) {
	classRoom c=new classRoom();
	System.out.println(c.classroom);
	System.out.println(c.deptname);
	System.out.println(c.cname);
	c.fee();
	c.games();
	c.fest();
	
	
}

}
