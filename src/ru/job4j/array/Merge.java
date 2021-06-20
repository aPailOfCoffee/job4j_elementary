package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (l < left.length && r < right.length) {
                rsl[i] = left[l] <= right[r] ? left[l++] : right[r++];
            } else {
                if (l == left.length && r < right.length) {
                    rsl[i] = right[r++];
                } else {
                    rsl[i] = left[l++];
                }
            }
        }
        return rsl;
    }
}
