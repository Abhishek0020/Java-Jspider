package Arr;

public class DuplicateLastIndex {
	public static void main(String[] args) {
        int[] a = {1, 2, 9, 3, 9, 4, 9, 6, 7, 8};
        int target = 9;
        int lastIndex = -1;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == target) {
                lastIndex = i;
                break;
            }
        }

        System.out.println("Last index of 9 is: " + lastIndex);
    }

}
