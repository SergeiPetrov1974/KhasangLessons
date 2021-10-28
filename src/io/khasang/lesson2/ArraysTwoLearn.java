package io.khasang.lesson2;

import io.khasang.lesson1.Dog;
import io.khasang.lesson1.Kitchen;

import java.util.Arrays;

public class ArraysTwoLearn {
    public static void main(String[] args) {
        Kitchen kitchen;
        Dog dog;

        int[] stable = new int[100];
        stable[3] = 55;
        for (int i = 0; i < stable.length; i++) {
            int number = stable[i];
            System.out.println(Arrays.toString(stable));
        }
    }
}
