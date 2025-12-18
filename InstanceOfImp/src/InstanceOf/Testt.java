package InstanceOf;

public class Testt {
	public static void main(String[] args) {
		Father obj=new Daughter();
		
		if(obj instanceof Son) {
			Son son=(Son) obj;
			
			System.out.println(son.name);
			
			System.out.println(son.trip);
			
			
		}
		else if (obj instanceof Daughter) {
			Daughter daughter=(Daughter) obj;
			
			System.out.println(daughter.name);
			System.out.println(daughter.shopping);
			
		}
		
		
	}

}
