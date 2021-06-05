package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(in);
        assertEquals(expected, out);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String out = DummyBot.answer(in);
        assertEquals(expected, out);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Прием-прием.";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String out = DummyBot.answer(in);
        assertEquals(expected, out);
    }
}