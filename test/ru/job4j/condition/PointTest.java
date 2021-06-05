package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10To20Then1() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3690To252Then370DotEtc() {
        int x1 = 369;
        int y1 = 0;
        int x2 = 2;
        int y2 = 52;
        double expected = 370.66;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when120ToNeg25Then15Etc() {
        int x1 = 1;
        int y1 = 20;
        int x2 = -2;
        int y2 = 5;
        double expected = 15.29;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}