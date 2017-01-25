package task1;

/**
 * @author Mark_Harbunou
 *         <p>
 *         Class that calculate sum of natural numbers that multiple to K
 */
public class NaturalValue {
    private int sum;

    /**
     * method that calculate and sum of natural numbers
     *
     * @param a massive of natural numbers
     * @param K the value of which natural numbers must be a multiple
     */
    public void calculateSumOfNumbersThatMultiple(int[] a, int K) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % K == 0) {
                sum = sum + a[i];
            }
        }
        System.out.println("sum = " + sum);
    }

    /**
     * method that check data for correctness
     *
     * @param a massive of natural numbers
     * @throws Exception
     */
    private void checkForCorrectness(double[] a) throws Exception {
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                throw new Exception("data in massive must be positive");
            }
            if (a[i] % 1 != 0) {
                throw new Exception("data in massive must be natural");
            }
        }
    }

    /**
     * @return sum of naturals numbers
     */
    public int getSum() {
        return sum;
    }
}
