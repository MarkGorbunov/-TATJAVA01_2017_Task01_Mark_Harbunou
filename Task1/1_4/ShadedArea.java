package task1;

/**
 * Class in which check coordinate to be found in the area and if it in print false
 * otherwise false
 *
 * @author Mark_Harbunou
 */
public class ShadedArea {
    /**
     * method that check coordinate to be found in the area and if it in print false
     * otherwise false
     *
     * @param x coordinate x
     * @param y coordinate y
     * @throws Exception
     */
    public void checkCoordinate(double x, double y) throws Exception {
        checkForCorrectness(x, y);
        if (((x >= -4 && x <= 3) && (y >= -3 && y <= 0)) ||
                ((x >= -2 && x <= 2) && (y > 0 && y <= 4))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * method that check input data for correctness
     *
     * @param a coordinate x
     * @param b coordinate y
     * @throws Exception
     */
    private void checkForCorrectness(double a, double b) throws Exception {
        if (Double.isNaN(a) || Double.isNaN(b) ||
                Double.isInfinite(a) || Double.isInfinite(b)) {
            throw new Exception("incorrect input data");
        }
    }
}
