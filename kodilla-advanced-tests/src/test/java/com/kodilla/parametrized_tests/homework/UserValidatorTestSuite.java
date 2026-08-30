package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.provider.NullSource;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"michal", "Jan123", "test_user", "abc", "michal.z"})
    public void shouldAcceptCorrectUsername(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "a!", "Jan Kowalski", "@test"})
    public void shouldRejectIncorrectUsername(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "test@gmail.com",
            "john.doe@example.com",
            "michal_123@test.pl"
    })
    public void shouldAcceptCorrectEmail(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "test",
            "test@",
            "@test.com",
            "test gmail.com"
    })
    public void shouldRejectIncorrectEmail(String email) {
        assertFalse(validator.validateEmail(email));
    }
    @ParameterizedTest
    @NullSource
    public void shouldRejectNullEmail(String email) {
        assertFalse(validator.validateEmail(email));
    }
    }