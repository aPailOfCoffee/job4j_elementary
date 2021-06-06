package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoneu, boolean beFriend) {
        if (hasMoneu || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't go.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
