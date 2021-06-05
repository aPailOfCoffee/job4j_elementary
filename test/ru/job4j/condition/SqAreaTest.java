package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenP37K4Square54DotEtc() {
        double p = 37;
        double k = 4;
        double expected = 54.760;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenP5K3Square1DotEtc() {
        double p = 5;
        double k = 3;
        double expected = 1.171;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.001);
    }
}