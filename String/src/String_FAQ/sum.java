package String_FAQ;

public class sum {
	public static void main(String[] args) {
		String string="ahi@123";
		int sum=0;
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(ch>='0' && ch<='9')
				sum+=ch-'0';
			
		}
		System.out.println("sum is : "+sum);
	}

}
