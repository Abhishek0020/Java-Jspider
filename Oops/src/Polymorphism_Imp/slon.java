package Polymorphism_Imp;

public class slon extends Insta {
	
	@Override
	void login() {
		int id=123;
		int pass=123;
		if(id==123) {
			if(pass==123) {
				System.out.println("login successfully : ");
			}
			else {
				System.out.println("wrong password : ");
			}
			
		}
		else {
			System.out.println("wrong id ");
		}
	}

}
