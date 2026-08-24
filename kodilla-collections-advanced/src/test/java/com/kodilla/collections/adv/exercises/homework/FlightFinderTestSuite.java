package com.kodilla.collections.adv.exercises.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");

        // then
        assertEquals(2, result.size());
        assertEquals("London", result.get(0).getArrival());
        assertEquals("Paris", result.get(1).getArrival());
    }

    @Test
    public void testFindFlightsTo() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> result = flightFinder.findFlightsTo("London");

        // then
        assertEquals(2, result.size());
        assertEquals("Warsaw", result.get(0).getDeparture());
        assertEquals("Krakow", result.get(1).getDeparture());
    }

    @Test
    public void testFindFlightsFromNonExistingCity() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> result = flightFinder.findFlightsFrom("Bialystok");

        // then
        assertTrue(result.isEmpty());
    }
}