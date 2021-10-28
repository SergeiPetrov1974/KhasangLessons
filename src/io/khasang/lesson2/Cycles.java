package io.khasang.lesson2;

public class Cycles {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }
        /*
        int a = 0;
        //int x = ++a + a++;
        //System.out.println(x);
        int n = a++ + ++a;
        System.out.println(n);
         */
        for (int j = 0; j < 3; j++) {
            System.out.println(j);

            int k = 0;
            do {
                System.out.println(k);
                k++;
            } while (k < 3);
        }
    }

}
