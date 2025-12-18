package constructor;


public class test2 extends test1 {
	int x=20;
	void add() {
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	public static void main(String[] args) {
		test2 test2=new  test2();
		test2.add();
	}

}
