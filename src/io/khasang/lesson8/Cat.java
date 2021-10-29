package io.khasang.lesson8;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
