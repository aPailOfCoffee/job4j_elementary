package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenLengthThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddLengthThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertArrayEquals(expected, result);
    }
}