package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalcFactorialFor5Then120() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalcFactorialFor0Then1() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        assertEquals(expected, result);
    }
}