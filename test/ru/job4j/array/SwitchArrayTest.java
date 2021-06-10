package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = new int[] {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1To2() {
        int[] input = new int[] {1, 2, 3, 4};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        assertArrayEquals(expected, result);
    }
}