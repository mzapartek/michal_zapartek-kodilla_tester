package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(
            "com.kodilla.parametrized_tests.homework.PersonSources#providePersonsForBMI"
    )
    public void shouldCalculateBMI(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }
}
