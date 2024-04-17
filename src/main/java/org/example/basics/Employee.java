package org.example.basics;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private int age;
    private String gender;
    private List<String> devices;
}
