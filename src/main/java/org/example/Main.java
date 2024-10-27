package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "John", "Doe", 28, "Canada"));
        users.add(new User(2, "Anna", "Smith", 32, "Canada"));
        users.add(new User(3, "Peter", "Brown", 25, "UK"));
        users.add(new User(4, "Maria", "Garcia", 30, "Spain"));
        users.add(new User(5, "Li", "Wang", 6, "China"));
        users.add(new User(6, "David", "Kim", 35, "South Korea"));
        users.add(new User(7, "Sara", "Johnson", 24, "Australia"));
        users.add(new User(8, "Michael", "Müller", 29, "Germany"));
        users.add(new User(9, "Sophia", "Rossi", 31, "Italy"));
        users.add(new User(10, "Ivan", "Petrov", 26, "Russia"));

        List<User> sortedByLastName = UserUtils.sortByLastName(users);
        System.out.println("Пользователи отсортированные по фамилии:");
        UserUtils.print(sortedByLastName);

        List<User> sortedByAge = UserUtils.sortByAge(users);
        System.out.println("Пользователи отсортированные по возрасту:");
        UserUtils.print(sortedByAge);

        boolean allAboveSeven = UserUtils.allAboveSeven(users);
        System.out.println("Все пользователи с возрастом > 7: " + allAboveSeven);

        double averageAge = UserUtils.averageAge(users);
        System.out.println("Средний возраст всех пользователей: " + averageAge);

        long distinctCountryCount = UserUtils.countDistinctCountry(users);
        System.out.println("Количество уникальных стран: " + distinctCountryCount);
    }
}