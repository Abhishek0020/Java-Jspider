package Matrix;

public class Spiral_Matrix {

    public static void main(String[] args) {
        int n = 5;  // Size of the matrix
        int[][] a = new int[n][n];  // Initialize the matrix
        int row = 0, col = 0;  // Start at the top-left corner
        char dir = 'r';  // Direction: 'r' for right, 'd' for down, 'l' for left, 'u' for up

        for (int i = 1; i <= n * n; i++) {
            // Place the current number in the matrix
            a[row][col] = i;

            // Move in the current direction
            switch (dir) {
                case 'r': {
                    col++;  // Move right
                    // Check if the column goes out of bounds or if the next cell is already filled
                    if (col == n || a[row][col] != 0) {
                        dir = 'd';  // Change direction to down
                        col--;  // Step back to the previous valid column
                        row++;  // Move down
                    }
                    break;
                }
                case 'd': {
                    row++;  // Move down
                    // Check if the row goes out of bounds or if the next cell is already filled
                    if (row == n || a[row][col] != 0) {
                        dir = 'l';  // Change direction to left
                        row--;  // Step back to the previous valid row
                        col--;  // Move left
                    }
                    break;
                }
                case 'l': {
                    col--;  // Move left
                    // Check if the column goes out of bounds or if the next cell is already filled
                    if (col < 0 || a[row][col] != 0) {
                        dir = 'u';  // Change direction to up
                        col++;  // Step back to the previous valid column
                        row--;  // Move up
                    }
                    break;
                }
                case 'u': {
                    row--;  // Move up
                    // Check if the row goes out of bounds or if the next cell is already filled
                    if (row < 0 || a[row][col] != 0) {
                        dir = 'r';  // Change direction to right
                        row++;  // Step back to the previous valid row
                        col++;  // Move right
                    }
                    break;
                }
            }
        }

        // Print the matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
