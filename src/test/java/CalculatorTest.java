import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;


    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void canSubtract(){
        int result = calculator.subtract(3,2);
        assertEquals(1, result);
    }

    @Test
    public void canMultiply(){
        int result = calculator.multiply(3,2);
        assertEquals(6, result);
    }

    @Test
    public void canDivide(){
        double result = calculator.divide(3,2);
        assertEquals(1.5, result, 0.1);
    }
}
