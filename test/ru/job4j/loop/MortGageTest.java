package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;

public class MortGageTest {

    @Test
    public void when1Year() {
        double amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = MortGage.year(amount, salary, percent);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void when2Year() {
        double amount = 100;
        int salary = 120;
        double percent = 50;
        int result = MortGage.year(amount, salary, percent);
        int expected = 2;
        assertEquals(expected, result);
    }
}