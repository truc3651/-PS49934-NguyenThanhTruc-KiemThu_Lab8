package poly;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddPositiveNumbers() {
        Assert.assertEquals(calculator.add(5, 3), 8);
    }

    @Test
    public void testAddNegativeNumbers() {
        Assert.assertEquals(calculator.add(-5, -3), -8);
    }

    @Test
    public void testAddMixedNumbers() {
        Assert.assertEquals(calculator.add(5, -3), 2);
    }

    @Test
    public void testAddZero() {
        Assert.assertEquals(calculator.add(5, 0), 5);
    }

    @Test
    public void testSubtractPositiveNumbers() {
        Assert.assertEquals(calculator.subtract(5, 3), 2);
    }

    @Test
    public void testSubtractNegativeNumbers() {
        Assert.assertEquals(calculator.subtract(-5, -3), -2);
    }

    @Test
    public void testSubtractMixedNumbers() {
        Assert.assertEquals(calculator.subtract(5, -3), 8);
    }

    @Test
    public void testSubtractZero() {
        Assert.assertEquals(calculator.subtract(5, 0), 5);
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        Assert.assertEquals(calculator.multiply(5, 3), 15);
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        Assert.assertEquals(calculator.multiply(-5, -3), 15);
    }

    @Test
    public void testMultiplyMixedNumbers() {
        Assert.assertEquals(calculator.multiply(5, -3), -15);
    }

    @Test
    public void testMultiplyByZero() {
        Assert.assertEquals(calculator.multiply(5, 0), 0);
    }

    @Test
    public void testDividePositiveNumbers() {
        Assert.assertEquals(calculator.divide(6, 3), 2);
    }

    @Test
    public void testDivideNegativeNumbers() {
        Assert.assertEquals(calculator.divide(-6, -3), 2);
    }

    @Test
    public void testDivideMixedNumbers() {
        Assert.assertEquals(calculator.divide(6, -3), -2);
    }

    @Test
    public void testDivideWithRemainder() {
        Assert.assertEquals(calculator.divide(7, 3), 2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
    }
}
