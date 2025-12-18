package AnnonymousInnerClass;

@FunctionalInterface 
interface Theater{
	void popcorn();
	
}
public class Demo {
	public static void main(String[] args) {
		
		Theater T1=new Theater() {
			
			@Override
			public void popcorn() {
				// TODO Auto-generated method stub
				System.out.println("salted popcorn : ");
				
			}
			public void m2() {
				System.out.println("m2()-Annonymous : ");
			}
		};
		T1.popcorn();
		//T1.m1();CTE
		Theater T2=new Theater() {
			
			@Override
			public void popcorn() {
				// TODO Auto-generated method stub
				System.out.println("peri peri popcorn : ");
				
			}
		};
		T2.popcorn();
		System.out.println(T1.getClass().getName());
		System.out.println(T2.getClass().getName());
	}

}
