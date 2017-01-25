package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Mark_Harbunou on 1/19/2017.
 *         <p>
 *         Class that calculate value of expression
 */
public class ExpressionDecision {
    private double valueOfExpression;

    /**
     * * Method that calculate value of expression
     *
     * @param a parameter "a" in expression
     * @param b parameter "b" in expression
     * @param c parameter "c" in expression
     * @return value of calculated expression
     * @throws Exception
     */
    public double expressionValue(double a, double b, double c) throws Exception {
        try {
            if (a == 0) {
                throw new Exception(" parameter (a) can not be equal to zero, impossible to divide by zero");
            }
            if ((b * b + 4 * a * c) < 0) {
                throw new Exception("with entered parameters expression b^2+4*a*c) become less than zero," +
                        "\n" + "so root of this expression become complex");
            }
            if (Double.isInfinite(a) || Double.isInfinite(a * a * a) || Double.isInfinite(b) || Double.isInfinite(c)
                    || Double.isInfinite(b * b) || Double.isInfinite(4 * a * c)) {
                throw new Exception("with entered parameters in expression appears infinity");
            }
            double valueOfExpression = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a + Math.pow(b, -2);
            // System.out.println("value of expression = " + valueOfExpression);
        } catch (InputMismatchException ex) {
            System.out.println("you entered not a number");
        }
        return valueOfExpression;
    }
}
