package task1;

/**
 * Class that calculate value of function and output it like table where first parameters it is value of argument
 * and second parameters it is value of function
 *
 * @author Mark_Harbunou
 */
public class ValueOfFunction {
    double paramOfFunc;
    double value;

    /**
     * method that calculate value of function
     */
    private void calculateValueOfFunction() {
        value = Math.sin(paramOfFunc) * Math.sin(paramOfFunc) -
                Math.cos(2 * paramOfFunc);
    }

    /**
     * method that output information like table where first parameters it is value of argument
     * and second parameters it is value of function
     *
     * @param min  first value in the line segment
     * @param max  last value in the line segment
     * @param step step of increment
     * @throws Exception
     */
    public void outputValueInTable(double min, double max, double step) throws Exception {
        checkForCorrectness(min, max, step);
        System.out.println("argument  ||" + "  value of function");
        for (paramOfFunc = min; paramOfFunc <= max; paramOfFunc = paramOfFunc + step) {
            calculateValueOfFunction();
            System.out.println(step + "  ||  " + value);
        }
    }

    /**
     * * method that check input data for correctness
     *
     * @param a first value in the line segment
     * @param b last value in the line segment
     * @param c step of increment
     * @throws Exception
     */
    private void checkForCorrectness(double a, double b, double c) throws Exception {
        if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c) ||
                Double.isInfinite(a) || Double.isInfinite(b) || Double.isInfinite(c)) {
            throw new Exception("incorrect input data");
        }
    }
}
