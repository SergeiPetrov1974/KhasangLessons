package io.khasang.lesson2;

import java.util.Arrays;

public class ArraysLearn {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 5, 22};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[3]);

        numbers[3] = 12;
        System.out.println(numbers[3]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
