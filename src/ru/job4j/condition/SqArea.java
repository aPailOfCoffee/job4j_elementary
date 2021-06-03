package ru.job4j.condition;

import java.sql.SQLOutput;

public class SqArea {
    public static double square(double p, double k) {
        return p / (2 * (k +1)) * k;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result);
    }
}
