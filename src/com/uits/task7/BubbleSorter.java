package com.uits.task7;

public class BubbleSorter {
    public static void main( int[] args ) {
        sortingArray(args);
        int[] array = new int[getRandom(100)];
       // = getRandom(100);
    }

    private static void sortingArray( int[] array ) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i - 1] > array[i]) {
                int tmp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = tmp;
            }
        }
    }

    public static int getRandom ( int i) {
        double r = Math.random() * i;
        int rand = (int) r;
        return rand;
    }
}

