package com.random.kafka.com.learn;

import java.util.ArrayList;
import java.util.Random;

public class TennRandoms {
    public static final Random generator = new Random();

    public static int randomElement(int[] a) {
        if (a.length > 0)
            return a[generator.nextInt(a.length)];
        else
            return 0;
    }

    public static int randomElement(ArrayList<Integer> a) {
        if (a.size() > 0)
            return a.get(generator.nextInt(a.size()));
        else
            return 0;
    }
}

 class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 20; i++) {
            int a = TennRandoms.randomElement(array);
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            int a = TennRandoms.randomElement(arrayList);
            System.out.print(a + " ");
        }
        System.out.println();
    }











}
