import atu.week8.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setUp()
    {
        calc = new Calculator();
    }

    /** ADD TEST **/
    @Test
    public void testAdd_Success()
    {
        assertEquals(20, calc.add(16,4));
    }

    @Test
    public void testAdd_Fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.add(Integer.MAX_VALUE, 1));
        assertEquals("Value Out Of Range", ex.getMessage());
    }

    /** SUBTRACT TEST **/
    @Test
    public void testSub_Success()
    {
        assertEquals(20, calc.sub(26,6));
    }

    @Test
    public void testSub_Fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.sub(Integer.MIN_VALUE, 1));
        assertEquals("Value Out Of Range", ex.getMessage());
    }

    /** MULTIPLY TEST **/
    @Test
    public void testMul_Success()
    {
        assertEquals(20, calc.mul(5,4));
    }

    @Test
    public void testMul_Fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.mul(Integer.MAX_VALUE, 1));
        assertEquals("Value Out Of Range", ex.getMessage());
    }

}
