package company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc = new Calculator();
    @Test
    public void shouldReturnSumOfTwoIntegers() {

        String failMessage = "Expected calculator to handle integer addition.";

        assertEquals(failMessage, 2, calc.addInt(1,1));
        assertEquals(failMessage, 5, calc.addInt(2,3));
        assertEquals(failMessage, 10, calc.addInt(4, 6));
    }

    @Test
    public void shouldReturnSubtractionOfTwoInts() {

        String failMessage= "Expected calculator to handle integer subtraction.";

        assertEquals(failMessage,-29 , calc.subtractInt(23,52));
        assertEquals(failMessage,10 , calc.subtractInt(15,5));
        assertEquals(failMessage, 24 , calc.subtractInt(30,6));
    }

    @Test
    public void shouldReturnProductOfTwoInts() {

        String failMessage= "Expected calculator to handle integer multiplication.";

        assertEquals(failMessage, 68, calc.multiplyInt(34,2));
        assertEquals(failMessage, 30, calc.multiplyInt(6,5));
        assertEquals(failMessage, 40, calc.multiplyInt(8,5));
    }

    @Test
    public void shouldReturnDivisionOfTwoInts() {

        String failMessage= "Expected calculator to handle integer division.";

        assertEquals(failMessage, 4, calc.divideInt(12,3));
        assertEquals(failMessage, 7, calc.divideInt(21,3));
        assertEquals(failMessage, 18, calc.divideInt(54,3));
    }

    @Test
    public void shouldReturnSumOfDouble() {

        String failMessage = "Expected calculator to handle double addition.";


        assertEquals(failMessage, 5.7,  calc.addDouble(3.4, 2.3), 0.01);


    }

    @Test
    public void shouldReturnSubtractionOfDouble() {

        String failMessage = "Expected calculator to handle double subtraction.";

        assertEquals(failMessage, 5.0,  calc.subtractDouble(5.5, 0.5), 0.01);

//        assert true: 5 == calc.subtractDouble(5.5, 0.5);



    }
    //
    @Test
    public void shouldReturnProductOfDouble() {

        String failMessage = "Expected calculator to handle double product.";

        assertEquals(failMessage, 29.48, calc.multiplyDouble(6.7, 4.4), 0.01);

    }
    //
    @Test
    public void shouldReturnDivisionOfDoubles() {

        String failMessage = "Expected calculator to handle double product.";

        assertEquals(failMessage, 4.9, calc.divideDouble(10.8, 2.2), 0.01);

    }
}