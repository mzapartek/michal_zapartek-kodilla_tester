package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> providePersonsForBMI() {
        return Stream.of(
                Arguments.of(new Person(2.0, 56), "Very severely underweight"),
                Arguments.of(new Person(2.0, 62), "Severely underweight"),
                Arguments.of(new Person(2.0, 68), "Underweight"),
                Arguments.of(new Person(2.0, 88), "Normal (healthy weight)"),
                Arguments.of(new Person(2.0, 108), "Overweight")
        );
    }
}
