package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertFalse(result);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] input = new boolean[] {false, false, false};
        boolean result = Check.mono(input);
        assertTrue(result);
    }
}