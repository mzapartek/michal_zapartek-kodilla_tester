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
                Arguments.of(new Person(2.0, 108), "Overweight"),

                Arguments.of(new Person(2.0, 128), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(2.0, 148), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(2.0, 168), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(2.0, 188), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(2.0, 220), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(2.0, 260), "Obese Class VI (Hyper Obese)"),

                Arguments.of(new Person(2.0, 100), "Overweight")
        );
    }
}
