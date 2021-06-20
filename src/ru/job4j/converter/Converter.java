package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        int inDollar = 600;
        int expectedEuro = 2;
        int expectedDollar = 10;
        int outEur = Converter.rubleToEuro(inEuro);
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        boolean passedEuro = expectedEuro == outEur;
        System.out.println("140 rubles are 2 euro. Test result: " + passedEuro);
        System.out.println("140 rubles are 2 euro. Test result: " + passedDollar);
    }
}
