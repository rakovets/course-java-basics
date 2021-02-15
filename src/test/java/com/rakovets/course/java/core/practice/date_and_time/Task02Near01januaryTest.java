package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.Temporal;

import static org.junit.jupiter.api.Assertions.*;

class Task02Near01januaryTest {

    @Test
    void adjustInto() {
        LocalDate expected = LocalDate.of(2021, 1, 1);
        Task02Near01january near = new Task02Near01january();

        LocalDate local = LocalDate.of(2020, 12, 5);

        Assertions.assertEquals(expected, near.adjustInto(local));
    }
}
