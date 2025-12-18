package String_FAQ;

public class Vowel {
	public static void main(String[] args) {
		
	
	String string="Abhishek Pal";
	
	int count=0;
	for(int i=0;i<=string.length()-1;i++) {
		char ch=string.charAt(i);
		
	
	if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' &&ch=='A'
			 || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
		count++;
	}
	}
	System.out.println(count);
}
}
