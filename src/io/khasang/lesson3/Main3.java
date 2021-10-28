package io.khasang.lesson3;

public class Main3 {
    public static void main(String[] args) {
        Cat cat2 = new Cat(3, "Murka", false);
        Cat cat1 = new Cat(5, "Tom", true);
        Cat tempCat = cat1;
        cat1.about();
        cat1 = cat2;
        cat1.about();
        tempCat.about();
    }
}
