package YoutubeString;

public class Count {
	public static void main(String[] args) {
		String string="Is Simple";
		int count=0;
		int countl=0;
		for(int i=0;i<string.length();i++) {
			char c=string.charAt(i);
			if(Character.isUpperCase(c))
				count++;
			if(Character.isLowerCase(c))
				countl++;
			
				
		}
		System.out.println(count+" "+"uppercase");
		System.out.println(countl+" lowercase ");
	}

}
