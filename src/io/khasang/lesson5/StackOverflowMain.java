package io.khasang.lesson5;

public class StackOverflowMain {
    private static int i;

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("testing ..." + i++);
        test();
    }
}
