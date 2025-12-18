package Set;

import java.util.HashSet;

public class Longest_Common_Sequnce {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: Check for the start of the sequence
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Step 3: Count sequence length
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Step 4: Update max length
                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2}; // Sample input
        int result = longestConsecutive(nums);
        System.out.println("Length of Longest Consecutive Sequence: " + result);
    }
}
