package Program;

public class Sum {
	public static void main(String[] args) {
		String string="abhishek@123";
		int sum=0;
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(ch>='0' && ch<='9') {
				sum+=ch-'0';
			}	
		}
		System.out.println("sum of the number is : "+sum);
	}
}
