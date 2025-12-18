package HahSet;

public class Driver {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(70);
		set.add(0);
		set.add(0);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(20);
		set.add(60);
		System.out.println(set.size());
		System.out.println("==============================");
		set.display();
		System.out.println("=====================");
		System.out.println(set.contains(10));
		System.out.println("-==-=======================");
		System.out.println(set.isEmpty());
		System.out.println("================================");
		System.out.println(set.remove(60));
		set.display();
		
	}

}
