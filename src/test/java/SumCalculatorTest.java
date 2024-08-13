import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    void createInstance() {
        this.sumCalculator = new SumCalculator();
    }


    @Test
    void sumTestOne() {
        int actualResult = sumCalculator.sum(1);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sumTestThree() {
        int actualResult = sumCalculator.sum(3);
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void sumTestZero() {
        assertThrows(IllegalArgumentException.class, ()-> sumCalculator.sum(0));
    }

    @Test
    void sumTestMinusOne() {
        assertThrows(IllegalArgumentException.class, ()-> sumCalculator.sum(-1));
    }
}