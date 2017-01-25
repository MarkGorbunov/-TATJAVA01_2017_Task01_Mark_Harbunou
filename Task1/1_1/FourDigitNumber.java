package task1;

import java.util.InputMismatchException;


/**
 * @author Mark_Harbunou
 *         <p>
 *         class that print true if the sum of first and second numeral of entered four digit numbers
 *         equal of third and fourth and false if different
 */
public class FourDigitNumber {

    /**
     * method that print true if the sum of first and second numeral of entered four digit numbers
     * equal of sum of third and fourth and false if different
     *
     * @param fourDigitNumber four digit number for check
     */
    public void checkSumsOfHalf(int fourDigitNumber) {
        try {
            //  check number for four digit
            if ((fourDigitNumber > 999 && fourDigitNumber < 10000) ||
                    (fourDigitNumber < -999 && fourDigitNumber > -10000)) {
                int firstHalf = fourDigitNumber / 100;
                int secondHalf = fourDigitNumber - firstHalf * 100;
                System.out.println(firstHalf == secondHalf);
            } else
                System.out.println("you entered is not a four digit number");
        } catch (InputMismatchException ex) {
            System.out.println("you entered not a whole number");
        }
    }
}
