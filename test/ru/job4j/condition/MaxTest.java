package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax20And10Then20() {
        int first = 20;
        int second = 10;
        int expected = 20;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax5And10Then10() {
        int first = 5;
        int second = 10;
        int expected = 10;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax1And1Then1() {
        int first = 1;
        int second = 1;
        int expected = 1;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }
}