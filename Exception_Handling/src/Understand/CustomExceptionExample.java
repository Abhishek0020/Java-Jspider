package Understand;



class AgeTooSmallException extends Exception {
    AgeTooSmallException(String message) {
        super(message);
    }
}
public class CustomExceptionExample {
public static void main(String[] args) {
	
	int age=15;
	try {
		if(age<18) {
			throw new AgeTooSmallException("Age must be 18 or above.");
			
		}
		System.out.println("ageis valid ...");
		
	} catch (AgeTooSmallException e) {
		// TODO: handle exception
		System.out.println("Exception: " + e.getMessage());
	}
	
}
}
