package io.khasang.lesson2;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                //System.out.print(j + " * " + i + " = " + i * j + "\t\t");
                System.out.printf("%d * %d == %d\t\t", j, i, i * j);
            }
            System.out.println();
        }
        System.out.printf("число %d, строка %s, дробное %.1f", 100, "Java", 22.233);
    }
}
