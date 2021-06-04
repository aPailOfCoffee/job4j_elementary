package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert600RbkThen10Dlr() {
        int in = 600;
        int expected = 10;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}