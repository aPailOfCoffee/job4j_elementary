package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftInd = 0;
        int rightInd = 0;

        for (int rslInd = 0; rslInd < rsl.length; rslInd++) {
            if (leftInd < left.length && rightInd < right.length) {
                rsl[rslInd] = left[leftInd] <= right[rightInd] ? left[leftInd++] : right[rightInd++];
            } else {
                if (leftInd == left.length && rightInd < right.length) {
                    rsl[rslInd] = right[rightInd++];
                } else {
                    if (rightInd == right.length && leftInd < left.length) {
                        rsl[rslInd] = left[leftInd++];
                    }
                }
            }
        }
        return rsl;
    }
    /*
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length]; //1 + 1
        int rslIndex = rsl.length - 1; // 1 + 1
        int leftInd = left.length - 1; // 1 + 1
        int rightInd = right.length - 1; // 1 + 1
        while (leftInd >= 0 && rightInd >= 0) { //1 + 1 + 1
            rsl[rslIndex--] = left[leftInd ] >= right[rightInd] ? left[leftInd--] : right[rightInd--];
        }
        while (leftInd  >= 0) {
            rsl[rslIndex--] = left[leftInd--];
        }
        while (rightInd >= 0) {
            rsl[rslIndex--] = right[rightInd--];
        }
        return rsl;
    }
     */
}
