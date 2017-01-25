package task1;

import java.util.DoubleSummaryStatistics;

/**
 * @author Mark_Harbunou
 *         <p>
 *         Class that calculate perimeter and square of rectangular triangle on two cathetus
 */
public class Triangle {
    private double perimeter;
    private double square;

    /**
     * method that calculate perimeter of rectangular triangle
     *
     * @param a first cathetus
     * @param b second cathetus
     * @return value of perimeter
     * @throws Exception
     */
    public double perimetrOfTriangle(double a, double b) throws Exception {
        checkLineOfTriangle(a, b);
        perimeter = a + b + Math.sqrt(a * a + b * b);
        return perimeter;
    }

    /**
     * method that calculate perimeter of rectangular triangle
     *
     * @param a first cathetus
     * @param b second cathetus
     * @return value of square
     * @throws Exception
     */
    public double squareOfTriangle(double a, double b) throws Exception {
        checkLineOfTriangle(a, b);
        square = a * b / 2;
        return square;
    }


    /**
     * method that check correctness of input information
     *
     * @param a
     * @param b
     * @throws Exception
     */
    private void checkLineOfTriangle(double a, double b) throws Exception {
        if (Double.isInfinite(a) || Double.isInfinite(b) || Double.isNaN(a) || Double.isNaN(b)) {
            throw new Exception("incorrect input data");
        }
        if ((!(a > 0) || !(b > 0))) {
            throw new Exception("triangle cannot exist");
        }
    }


}