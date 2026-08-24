package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        // when
        List<String> result = UsersManager.filterChemistGroupUsernames();

        // then
        List<String> expected = List.of("Walter White", "Gale Boetticher");
        assertEquals(expected, result);
    }

    @Test
    public void testFilterUsersOlderThan() {
        // when
        List<User> result = UsersManager.filterUsersOlderThan(40);

        // then
        assertTrue(result.stream().allMatch(user -> user.getAge() > 40));
    }

    @Test
    public void testFilterUsersWithNoPosts() {
        // when
        List<String> result = UsersManager.filterUsersWithNoPosts();

        // then
        List<String> expected = List.of("Gus Firing", "Mike Ehrmantraut");
        assertEquals(expected, result);
    }
}