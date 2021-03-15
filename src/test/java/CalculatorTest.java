import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(20, 50);}

    @Test
    public void add(){
        assertEquals(70, calculator.add());
    }

    @Test
    public void subtract(){
        assertEquals(-30, calculator.subtract());
    }
    @Test
    public void multiply(){
        assertEquals(1000, calculator.multiply());
    }

    @Test
    public void divide(){
        assertEquals(0.4, calculator.divide(20, 50), 0.1);
    }




}
