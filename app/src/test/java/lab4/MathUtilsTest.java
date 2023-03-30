package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = MathUtils.getInstance();
    }

    @Test
    void testDivide() {
        assertEquals(2, mathUtils.divide(10, 5));
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
    }

    @Test
    void testSquareRoot() {
        assertEquals(2, mathUtils.squareRoot(4));
        assertThrows(IllegalArgumentException.class, () -> mathUtils.squareRoot(-1));
    }

    @Test
    void testGetSubArray() {
        int[] array = {1, 2, 3, 4, 5};
        
        assertArrayEquals(new int[]{2, 3, 4}, mathUtils.getSubArray(array, 1, 3));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mathUtils.getSubArray(array, -1, 3));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mathUtils.getSubArray(array, 1, 5));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mathUtils.getSubArray(array, 3, 1));
    }

    @Test
    void testSingleton() {
      

        MathUtils m1 =  MathUtils.getInstance();
        MathUtils m2 =  MathUtils.getInstance();
        assertSame(m1,m2 , "not the same object");

    }

}
