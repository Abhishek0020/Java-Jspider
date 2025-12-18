package TwoPointer;

public class reverseString {
	public static void main(String[] args) {
		
		String string="Abhishek";
		String reversed=reverseString(string);
		System.out.println(reversed);
	}
	public static String reverseString(String s) {
		
		char[] arr=s.toCharArray();
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
			
		}
		return new String(arr);
		
	}

}
