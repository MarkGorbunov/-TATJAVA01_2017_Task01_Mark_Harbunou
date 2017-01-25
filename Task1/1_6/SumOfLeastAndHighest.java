package task1;

/**
 * Class that finding min and max
 *
 * @author Mark_Harbunou
 */
public class SumOfLeastAndHighest {
    double min;
    double max;

    /**
     * method that finding min and max in massive
     *
     * @param numbers massive of numbers in that finding min and max
     */
    private void findingMinAndMax(double[] numbers) {
        min = numbers[0];
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[0]) {
                min = numbers[i];
            }
            if (numbers[i] > numbers[0]) {
                max = numbers[i];
            }
        }
    }

    /**
     * method that calculate sum of min and max in massive
     *
     * @param numbers massive of numbers in that finding min and max
     * @return sum of min and mux
     * @throws Exception
     */
    public double sumOfMinAndMax(double[] numbers) throws Exception {
        checkForCorrectness(numbers);
        findingMinAndMax(numbers);
        double sum = min + max;
        System.out.println("sum of min and max = " + sum);
        return sum;
    }

    /**
     * method that check data for correctness
     *
     * @param numbers massive of numbers in that finding min and max
     * @throws Exception
     */
    private void checkForCorrectness(double[] numbers) throws Exception {
        if (numbers.length != 3) {
            throw new Exception("amount of number most be 3");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (Double.isNaN(numbers[i]) ||
                    Double.isInfinite(numbers[i])) {
                throw new Exception("incorrect input data");
            }
        }
    }

}
