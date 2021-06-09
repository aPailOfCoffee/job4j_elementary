package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void whenCheck5ThenTrue() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertTrue(result);
    }

    @Test
    public void whenCheck4ThenFalse() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertFalse(result);
    }

    @Test
    public void whenCheck1ThenTrue() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertTrue(result);
    }
}