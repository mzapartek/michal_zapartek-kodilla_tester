package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    private GamblingMachine machine = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionForInvalidNumbers(
            int n1, int n2, int n3, int n4, int n5, int n6) {

        Set<Integer> numbers = new HashSet<>(
                Arrays.asList(n1, n2, n3, n4, n5, n6)
        );

        assertThrows(
                InvalidNumbersException.class,
                () -> machine.howManyWins(numbers)
        );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineValid.csv", numLinesToSkip = 1)
    public void shouldReturnResultForValidNumbers(
            int n1, int n2, int n3, int n4, int n5, int n6) throws InvalidNumbersException {

        Set<Integer> numbers = new HashSet<>(
                Arrays.asList(n1, n2, n3, n4, n5, n6)
        );

        int result = machine.howManyWins(numbers);

        assertTrue(result >= 0 && result <= 6);
    }
}