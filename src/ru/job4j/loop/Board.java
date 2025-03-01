package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < width; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((cell + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] arg) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
