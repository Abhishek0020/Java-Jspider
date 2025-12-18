package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gmail {
	public static void main(String[] args) {
		String s="palabhishek13072001@gmail.com";
		
		String exp="[a-z][a-z0-9-\\.$]+@gmail.com";
		
		Pattern pattern=Pattern.compile(exp);
		Matcher matcher=pattern.matcher(s);
		
		if(matcher.matches())
			System.out.println("valid gmail..");
		else 
			System.out.println("invalid gmail....");
	}

}
