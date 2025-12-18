package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
		Queue<Integer>q=new ArrayDeque<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		System.out.println(q.size());//6
		System.out.println(q.peek());//10
		System.out.println(q.isEmpty());//false
		System.out.println("====================");
		while(!q.isEmpty())
			System.out.println(q.poll());
		System.out.println("===========");
		System.out.println(q.isEmpty());//true
		
	}

}
