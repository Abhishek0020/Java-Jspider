package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	
	public static void main(String[] args) {
		String s="Abhi@1234";
//		String exp="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.[*&^%$#@!]){5,11}";
//		String exp="[A-z][a-z]["
		String exp = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[&^%$#@!])[A-Za-z0-9&^%$#@!]{5,11}";

		Pattern pattern=Pattern.compile(exp);
		Matcher matcher=pattern.matcher(s);
		if(matcher.matches())
			System.out.println("valid password...");
		else 
			System.out.println("invalid password....");
	}

}
