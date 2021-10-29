package io.khasang.lesson7;

public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Tom", 10);
        cat1.about();
        cat2.about();
        System.out.println(Cat.catsAmount);
    }
}
