package io.khasang.lesson8;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 10);
        Cat cat2 = new Cat("Tom", 10);
        if (cat1 == cat2) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
        if (cat1.equals(cat2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
