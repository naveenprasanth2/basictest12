package org.example.sealed;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public sealed class Animal permits Elephant {
    private final String name, work;
}
