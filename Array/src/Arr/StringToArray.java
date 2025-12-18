package Arr;

public class StringToArray {
	public static void main(String[] args) {
		String string="java is fun";
		
		//split the String by spaces and convert it  to an array
		String[]  res=string.split(" ");
		
		
		
		//print each word in an array----
		for(String word:res) {
			System.out.println(word);
		}
		
	}

}
