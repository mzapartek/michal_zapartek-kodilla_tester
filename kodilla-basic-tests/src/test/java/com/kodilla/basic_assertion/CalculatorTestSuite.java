package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        int subtractResult = calculator.subtract(5, 8);

        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquareForNegativeNumber() {
        Calculator calculator = new Calculator();

        double squareResult = calculator.square(-5);

        assertEquals(25.0, squareResult, 0.001);
    }

    @Test
    public void testSquareForZero() {
        Calculator calculator = new Calculator();

        double squareResult = calculator.square(0);

        assertEquals(0.0, squareResult, 0.001);
    }

    @Test
    public void testSquareForPositiveNumber() {
        Calculator calculator = new Calculator();

        double squareResult = calculator.square(5);

        assertEquals(25.0, squareResult, 0.001);
    }
}
