package ru.job4j.loop;

public class MortGage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        while (amount > 0) {
            amount = amount + amount * percent - salary;
            year++;
        }
        return year;
    }
}
