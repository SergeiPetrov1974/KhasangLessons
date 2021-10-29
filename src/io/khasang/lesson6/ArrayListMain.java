package io.khasang.lesson6;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList<Ship> ships = new ArrayList<Ship>();
        ships.add(new Ship());
        list.add(123);
        list.add(12);
        list.add("Hello");
        list.remove("Hello");
        System.out.println(list);
        for (Object o : list) {
            System.out.println();
        }
    }
}
