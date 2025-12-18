//package Multithreading;
//
//class mythread extends Thread{
//	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println("child thread : "+i);
//			try {
//				Thread.sleep(600);
//			}
//			catch (InterruptedException e) {
//				// TODO: handle exception
//			}
//		}
//	}
//}
//public class Text {
//	public static void main(String[] args) throws InterruptedException {
//		mythread t1=new mythread();
//		t1.start();
//		for(int i=1;i<=10;i++) {
//			System.out.println("main thrad : "+i);
//			Thread.sleep(600);
//		}
//	}
//
//}
