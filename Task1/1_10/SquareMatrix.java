package task1;

/**
 * @author Mark_Harbunou
 */
public class SquareMatrix {
    int[][] matrix;

    /**
     * mehtod that make square matrix  with size n where n is even
     *
     * @param n size of matrix
     * @return square matrix
     * @throws Exception
     */
    public int[][] matrixMaker(int n) throws Exception {
        checkForCorrectness(n);
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                }
                if (i % 2 != 0) {
                    matrix[i][j] = n - j;
                }
            }
        }
        for (int i = 0; i < n; i = i + 1) {
            System.out.println(" ");
            for (int j = 0; j < n; j = j + 1) {
                System.out.print(matrix[i][j] + "|");

            }
        }
        return matrix;
    }

    /**
     * method that check input data for correctness
     *
     * @param n size of matrix
     * @throws Exception
     */
    private void checkForCorrectness(int n) throws Exception {
        if (n % 2 == 0) {
            throw new Exception("n must be even");
        }
    }
}

