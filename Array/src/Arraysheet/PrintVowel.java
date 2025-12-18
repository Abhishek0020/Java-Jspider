package Arraysheet;

public class PrintVowel {
	public static void main(String[] args) {
		char arr[]= {'a','b','c','d','d','e','i','o','u'};
		PrintVowel.vowel(arr);
		
	}
	public static void vowel(char arr[]) {
		for(char ch:arr) {
			if("aeiouAEIOU".indexOf(ch)!=-1) {
				System.out.print(ch);
			}
		}
	}

}
