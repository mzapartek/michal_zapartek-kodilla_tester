package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    public void testAveragePostsForUsersAge40OrMore() {
        // given
        List<User> users = new ArrayList<>();
        users.add(new User("User1", 40, 10, "Test"));
        users.add(new User("User2", 50, 30, "Test"));
        users.add(new User("User3", 20, 100, "Test"));

        // when
        double result = ForumStats.getAveragePostsForUsersAge40OrMore(users);

        // then
        assertEquals(20.0, result);
    }

    @Test
    public void testAveragePostsForUsersUnder40() {
        // given
        List<User> users = new ArrayList<>();
        users.add(new User("User1", 40, 10, "Test"));
        users.add(new User("User2", 30, 20, "Test"));
        users.add(new User("User3", 20, 40, "Test"));

        // when
        double result = ForumStats.getAveragePostsForUsersUnder40(users);

        // then
        assertEquals(30.0, result);
    }
    @Test
    public void testAveragePostsWhenNoUsersMatch() {
        // given
        List<User> users = new ArrayList<>();
        users.add(new User("User1", 20, 10, "Test"));
        users.add(new User("User2", 30, 20, "Test"));

        // when
        double result = ForumStats.getAveragePostsForUsersAge40OrMore(users);

        // then
        assertEquals(0.0, result);
    }
}