package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.util.List;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        System.out.println(getAveragePostsForUsersAge40OrMore(users));
        System.out.println(getAveragePostsForUsersUnder40(users));
    }

    public static double getAveragePostsForUsersAge40OrMore(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .orElse(0.0);
    }

    public static double getAveragePostsForUsersUnder40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .orElse(0.0);
    }
}