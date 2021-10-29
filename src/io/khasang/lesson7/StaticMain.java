package io.khasang.lesson7;

public class StaticMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        cat1.showCatsAmount();
        Cat cat2 = new Cat("Murka");
        cat2.showCatsAmount();
        Cat cat3 = new Cat("Barsik");
        cat3.showCatsAmount();
    }
}
