package io.khasang.lesson2;

public class ArraysThreeLearn {
    public static void main(String[] args) {
        char[][] cells = new char[3][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                cells[j][i] = '.';
            }
            System.out.println();
        }
        cells[1][1] = '0';
        cells[2][1] = 'X';

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[j][i]);
            }
            System.out.println();
        }
    }
}
