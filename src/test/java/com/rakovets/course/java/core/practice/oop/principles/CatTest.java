package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CatTest {
    @Test
    void mew() {
        // GIVEN
        Cat cat = new Cat("Boriska");
        String expectedMew = "meow";
        // WHEN
        String actualMew = cat.mew();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void purr() {
        // GIVEN
        Cat cat = new Cat("Boriska");
        String expectedMew = "mr";
        // WHEN
        String actualMew = cat.purr();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void getName() {
        // GIVEN
        Cat cat = new Cat("Boriska");
        String expectedMew = "Boriska";
        // WHEN
        String actualMew = cat.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void setName() {
        // GIVEN
        Cat cat = new Cat("Boriska");
        String expectedMew = "Jerry";
        // WHEN
        cat.setName("Jerry");
        String actualMew = cat.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    static Stream<Arguments> ProviderArgumentsForMew() {
        return Stream.of(
                Arguments.of(90, new Person(100))
        );
    }
    @ParameterizedTest
    @MethodSource("ProviderArgumentsForMew")
    void mew(double expectedDouble, Person user) {
        Cat cat = new Cat("Boris");
        cat.mew(user);
        Assertions.assertEquals(expectedDouble, user.getHappiness());
    }

    @Test
    static Stream<Arguments> ProviderArgumentsForPurr() {
        return Stream.of(
                Arguments.of(110, new Person(100))
        );
    }
    @ParameterizedTest
    @MethodSource("ProviderArgumentsForPurr")
    void purr(double expectedDouble, Person user) {
        Cat cat = new Cat("Boris");
        cat.purr(user);
        Assertions.assertEquals(expectedDouble, user.getHappiness());
    }
}
