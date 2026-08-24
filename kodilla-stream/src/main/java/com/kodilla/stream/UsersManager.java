package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {
        processUsersStream();
        System.out.println(filterChemistGroupUsernames());
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<User> filterUsersOlderThan(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public static List<String> filterUsersWithNoPosts() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}