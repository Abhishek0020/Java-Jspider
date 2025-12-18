package Multithreading;

public class Test1 {
public static void main(String[] args) {
	mythread t1=new mythread();
	t1.setPriority(9);
	System.out.println(t1.getPriority());
	System.out.println(Thread.currentThread().getPriority());
	t1.start();
	for(int i=1;i<10;i++) {
		System.out.println("main thread : "+i);
	}
}	
}
class mythread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread : "+i);
		}
	}
}
