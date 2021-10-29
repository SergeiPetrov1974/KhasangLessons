package io.khasang.lesson10;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.age = 10;
        animal1.about();
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.home = "Home";
        //cat.about();

        Dog dog = new Dog();
        dog.age = 4;
        dog.name = "Sharik";
        //dog.about();
        Animal[] animals = new Animal[4];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = new Crocodile();
        animals[3] = new Lion();
        for (Animal animal : animals) {
            animal.about();
        }
    }
}
