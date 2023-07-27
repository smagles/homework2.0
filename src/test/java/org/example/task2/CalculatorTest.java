package org.example.task2;

import org.example.task2.Calculator;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testAdd() {
        //Given

        Calculator calculator = new Calculator();

        //When
        final int value1 = 10;
        final int value2 = 5;

        final int result = calculator.add(value1, value2);

        //Then 

        final int expected = 15;
        assertEquals(expected, result);

    }

    @Test
    public void testSubtract() {
        //Given

        Calculator calculator = new Calculator();

        //When
        final int value1 = 5;
        final int value2 = 100;

        final int result = calculator.subtract(value1, value2);

        //Then

        final int expected = -95;
        assertEquals(expected, result);

    }

    @Test
    public void testMultiply() {
        //Given

        Calculator calculator = new Calculator();

        //When
        final int value1 = 8;
        final int value2 = 8;

        final int result = calculator.multiply(value1, value2);

        //Then

        final int expected = 64;
        assertEquals(expected, result);

    }

    @Test
    public void testDivide() {
        //Given

        Calculator calculator = new Calculator();

        //When
        final int value1 = 88;
        final int value2 = 8;

        final double result = calculator.divide(value1, value2);

        //Then

        final double expected = 11d;
        assertEquals(expected, result, 0.001);

    }

    @Test
    public void testDivideByZero() {
        //Given

        Calculator calculator = new Calculator();

        //When & Then
        final int value1 = 7;
        final int value2 = 0;

        assertThrows(IllegalArgumentException.class, () -> calculator.divide(value1, value2));

    }

    @Test
    public void testSquareRoot() {
        //Given

        Calculator calculator = new Calculator();

        //When
        final int value = 25;

        final double result = calculator.sqrt(value);

        //Then

        final double expected = 5d;
        assertEquals(expected, result, 0.001);

    }

    @Test
    public void testSquareRootOfNegativeNumber() {
        // Given

        Calculator calculator = new Calculator();

        // When & Then
        
        final int value = -25;
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(value));
    }

}
