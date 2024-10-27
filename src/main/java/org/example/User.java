package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;
}
