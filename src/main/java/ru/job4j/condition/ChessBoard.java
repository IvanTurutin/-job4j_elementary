package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        boolean isPositive = x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0;
        boolean lessEight = x1 < 8 && y1 < 8 && x2 < 8 && y2 < 8;
        boolean isDiag = Math.abs(x1 - x2) == Math.abs(y1 - y2);
        if (isPositive && lessEight && isDiag) {
            return Math.abs(x1 - x2);
        } else {
            return 0;
        }
    }
}
