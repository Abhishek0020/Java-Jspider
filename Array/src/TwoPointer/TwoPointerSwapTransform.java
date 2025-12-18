package TwoPointer;

public class TwoPointerSwapTransform {
	public static void main(String[] args) {
		String input="Abhishek";
		String target="Abhisehk";
		
		String result=swapToMatchTarget(input, target);
		System.out.println("output : "+result);
	}
	public static String swapToMatchTarget(String input, String target) {
        if (input.length() != target.length()) return input;

        int first = -1, second = -1;

        // Find the two positions where characters are different
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != target.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    break; // more than 2 differences, not a simple swap
                }
            }
        }

        // Swap the mismatched characters in the input
        if (first != -1 && second != -1) {
            char[] arr = input.toCharArray();
            char temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
            return new String(arr);
        }
        return input;
    }
}
