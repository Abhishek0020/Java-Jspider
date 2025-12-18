package Multithreading;



class mythread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			if(i==4) {
			System.out.println("child thread : ");
		}
		}
		
	}
}
public class Test2 {
	public static void main(String[] args) {
		mythread t1=new mythread();
		t1.start();
		for(int i=1;i<=5;i++) {
		System.out.println("main class thread : ");
		}
	}
}
