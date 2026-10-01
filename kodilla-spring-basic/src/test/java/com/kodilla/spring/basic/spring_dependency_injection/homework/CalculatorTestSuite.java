package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void shouldAddNumbers() {
        double result = calculator.add(2.0, 3.0);

        assertEquals(5.0, result);
    }

    @Test
    public void shouldSubtractNumbers() {
        double result = calculator.subtract(5.0, 3.0);

        assertEquals(2.0, result);
    }

    @Test
    public void shouldMultiplyNumbers() {
        double result = calculator.multiply(4.0, 3.0);

        assertEquals(12.0, result);
    }

    @Test
    public void shouldDivideNumbers() {
        double result = calculator.divide(10.0, 2.0);

        assertEquals(5.0, result);
    }
}
