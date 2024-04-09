package org.example.basics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Employee {
    private String name;
    private int age;
    private String gender;
    private List<String> devices;
}
