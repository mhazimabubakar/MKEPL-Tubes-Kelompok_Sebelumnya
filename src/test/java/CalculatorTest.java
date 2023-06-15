package src.main.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        calculator.add(2, 3);
        assertEquals(5, calculator.getHasilInt());
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        calculator.subtract(5, 2);
        assertEquals(3, calculator.getHasilInt());
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        calculator.multiply(4, 5);
        assertEquals(20, calculator.getHasilInt());
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 2);
        assertEquals(5.0, calculator.getHasilDouble(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }

}