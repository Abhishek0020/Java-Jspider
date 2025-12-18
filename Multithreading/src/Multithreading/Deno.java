package Multithreading;


class T1 implements  Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("child thread : "+i);
		}
	}

	public void join() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("child thread : "+i);
		}
	}
}
public class Deno {
	public static void main(String[] args) {
		T1 t1=new T1();
		Thread t=new Thread(t1);
		t.start();
		
		
	}

}
