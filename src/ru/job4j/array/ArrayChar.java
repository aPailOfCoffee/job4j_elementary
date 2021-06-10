package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean rst = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                rst = false;
                break;
            }
        }
        return  rst;
    }
}
