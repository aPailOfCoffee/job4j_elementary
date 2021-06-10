package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rst = true;
        for (int index = 0; index < data.length; index++) {
            if (data[0] != data[index]) {
                rst = false;
                break;
            }
        }
        return rst;
    }
}
