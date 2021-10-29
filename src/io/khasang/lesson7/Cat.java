package io.khasang.lesson7;

public class Cat {
    static int catsAmount;
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
        catsAmount++;
    }

    public void about() {
        System.out.println(name + " " + age);
    }

    public void showCatsAmount() {
        System.out.println(catsAmount);
    }
}
