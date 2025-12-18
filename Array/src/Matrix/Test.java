package Matrix;

public class Test {
    public static void main(String[] args) {
        int n = 5; // Matrix size
        int[][] matrix = new int[n][n];

        // Filling the matrix using nested loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int min;
                if (i < j) {
                    if (i < n - 1 - j) {
                        min = i;
                    } else {
                        min = n - 1 - j;
                    }
                } else {
                    if (j < n - 1 - i) {
                        min = j;
                    } else {
                        min = n - 1 - i;
                    }
                }
                matrix[i][j] = min + 1;
            }
        }

        // Printing the matrix using nested loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
