package Interview_Questions;

public class VowelCounter {
	
	public static void main(String[] args) {
		String s="Abhishek Pal";
		
		long vowelCount=s.toLowerCase().chars()
					.filter(ch->"aeiouAEIOU".indexOf(ch)!=-1).count();
		System.out.println("vowel count : "+vowelCount);
	}
}
