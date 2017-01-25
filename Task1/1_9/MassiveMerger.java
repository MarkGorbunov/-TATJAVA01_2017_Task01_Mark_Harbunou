package task1;

/**
 * @author Mark_Harbunou
 */
public class MassiveMerger {
    double[] mainArray;

    /**
     * method that insert second massive in the first after index k
     *
     * @param a massive in which we insert another massive
     * @param b massive for insert
     * @param k paremeter after that begin an insert
     * @return
     */
    public double[] merger(double[] a, double[] b, int k) {
        mainArray = new double[a.length + b.length];
        for (int i = 0; i < k; i++) {
            mainArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            mainArray[k + i] = b[i];
        }
        for (int i = 0; i < a.length - k; i++) {
            mainArray[k + b.length + i] = a[i];
        }
        return mainArray;
    }

    /**
     * * method that check data for correctness
     *
     * @param a massive in which we insert another massive
     * @param b massive for insert
     * @param c paremeter after that begin an insert
     * @throws Exception
     */
    private void checkForCorrectness(double[] a, double[] b, int c) throws Exception {

        double length = a.length < b.length ? b.length : a.length;
        for (int i = 0; i < length; i++) {
            if (Double.isNaN(a[i]) || Double.isNaN(b[i]) ||
                    Double.isInfinite(a[i]) || Double.isInfinite(b[i])) {
                throw new Exception("incorrect input data");
            }
        }
        if (c > a.length) {
            throw new Exception("k bigger than length of massive");
        }
    }

}
