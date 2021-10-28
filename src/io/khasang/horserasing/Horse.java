package io.khasang.horserasing;

public class Horse {
    String name;
    int speed;
    String color;
    boolean isMale;
    int age;

    public void eat() {
        System.out.println("eating ...");
    }

    public void about() {
        String sex = (isMale) ? "Male" : "Female";
        System.out.printf("name %s, age %d, sex %s", name, age, sex);
    }

    public void ride() {
        about();
        System.out.println("riding at speed " + speed);
    }
}
