package regex;

//import java.util.regex.*;

public class Mobile {
	public static void main(String[] args) {
//        String mobileNumber = "6306593765"; // Test mobile number
//        String regex = "^[7-9][0-9]{9}$"; // Regex for valid mobile number (10 digits starting with 7, 8, or 9)
//        
//        // Compile the regex
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(mobileNumber);
//        
//        if (matcher.matches()) {
//            System.out.println("Valid mobile number...");
//        } else {
//            System.out.println("Invalid mobile number...");
//        }
		
		String phone="6306593765";
		String regex="[6-9]{1}[0-9]{9}";
		if(phone.matches(regex)==true) {
			System.out.println(phone+" 	valid mobile number : ");
		}
		else {
			System.out.println(phone+" invalid mobile number : ");
		}
    }  
}
