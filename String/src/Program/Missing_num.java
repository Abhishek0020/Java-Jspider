package Program;

public class Missing_num {
    public static void main(String[] args) {
        String input = "a5bcd3e1";
        findMissingNumbers(input);
    }
    public static void findMissingNumbers(String input) {
        boolean[] present = new boolean[10]; // Array to track digit presence (0-9)
        // Mark digits that are present in the input string
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                present[ch - '0'] = true; // Mark the corresponding index   
            }
        }

        // Print missing digits
        System.out.print("Missing numbers: ");
        for (int i = 0; i <= 9; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

