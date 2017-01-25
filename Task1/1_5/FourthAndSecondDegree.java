package task1;

import java.util.DoubleSummaryStatistics;

/**
 * Class that check polarity of number and power it to the 2nd degree if it positive
 * if it negarive power it to the 4th degree
 *
 * @author Mark_Harbunou
 */
public class FourthAndSecondDegree {
    /**
     * method that check polarity of number
     *
     * @param a parameters for checking
     * @return true if positive,false if negative
     */
    private boolean checkPolarity(double a) {
        return (a < 0);
    }

    /**
     * method that power  numbers to the 2nd degree if it positive
     * if it negarive power it to the 4th degree
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return massive of three numbers
     */
    public double[] involution(double a, double b, double c) throws Exception {
        checkForCorrectness(a);
        checkForCorrectness(b);
        checkForCorrectness(c);
        double x = checkPolarity(a) ? a * a * a * a : a * a;
        double y = checkPolarity(b) ? b * b * b * b : b * b;
        double z = checkPolarity(c) ? c * c * c * c : c * c;
        System.out.println("x= " + x + " y= " + y + " z= " + z);
        double degreeOfNumber[] = {x, y, z};
        return degreeOfNumber;
    }

    /**
     * method that check data for correctness
     *
     * @param a number for checking
     * @throws Exception
     */
    private void checkForCorrectness(double a) throws Exception {
        if (Double.isNaN(a) ||
                Double.isInfinite(a) ||
                Double.isInfinite(a * a) ||
                Double.isInfinite(a * a * a * a)) {
            throw new Exception("incorrect input data");
        }
    }
}
