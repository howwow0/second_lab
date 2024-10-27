package org.example;

import java.util.Comparator;
import java.util.List;

public class UserUtils {
    public static List<User> sortByLastName(List<User> users) {
       return users.stream().sorted(Comparator.comparing(User::getLastName)).toList();
    }
    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).toList();
    }
    public static boolean allAboveSeven(List<User> users) {
        return users.stream().allMatch(u -> u.getAge() > 7);
    }
    public static double averageAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).average().orElse(0);
    }
    public static long countDistinctCountry(List<User> users) {
        return users.stream().map(User::getCountry).distinct().count();
    }
    public static void print(List<User> users) {
        users.forEach(System.out::println);
    }
}
