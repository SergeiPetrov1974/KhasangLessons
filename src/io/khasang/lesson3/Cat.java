package io.khasang.lesson3;

public class Cat {
    int age;
    String name;
    double weight;
    boolean isMale;
    Tail tail;
    Talisman talisman;

    public Cat(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public static void voice() {
        System.out.println("Myow");
    }

    public static void sleep() {
        System.out.println("Brrr");
    }

    public void about() {
        String s = "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isMale=" + isMale +
                ", tail=" + tail +
                ", talisman=" + talisman +
                '}';
        System.out.println(s);
    }
}
