

package lab4;
import java.util.Arrays;
public class MathUtils {

    private static MathUtils instance;

    private MathUtils() {

        
    }

    public static MathUtils getInstance() {
        if (instance == null) {
            instance = new MathUtils();
        }
        return instance;
    }

    public int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        }
        return dividend / divisor;
    }

    public double squareRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }
        return Math.sqrt(number);
    }7

    public int[] getSubArray(int[] array, int startIndex, int endIndex) throws ArrayIndexOutOfBoundsException {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            throw new ArrayIndexOutOfBoundsException("Invalid start or end index.");
        }
        return Arrays.copyOfRange(array, startIndex, endIndex + 1);
    }

    public double calculateCircleArea(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }
        return Math.PI * radius * radius;
    }

}
