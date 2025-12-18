package InterFaceImp;

public class D extends E implements Test1,Test2 {
	public static void main(String[] args) {
		Test1 test1=new D();
			
		Test2  t=new D();
		
		test1.m1();
		t.m2();
		t.m3();
		}
			
			
		
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("m1");
				
			}
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("m2");
			
		
	}
			public void m3() {
				System.out.println("m3");
			}

}
