/*Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
  Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
   Распечатать оба массива.*/

package com.uits.task6;

public class Array {
    public static void main( String[] args ) {
            int[][] twoD = new int[5][8];
        int[][] twoB = new int[5][2];
        int i, j = 0;
        int min = 0;
        int max = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 8; j++) {
                twoD[i][j] = getRandom(100);
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < 5; i++) {
            min = twoD[i][0];
            max = twoD[i][0];
            for (j = 0; j < 8; j++) {
                if (twoD[i][j] < min) {
                    min = twoD[i][j];
                }
                if (twoD[i][j] > max) {
                    max = twoD[i][j];
                }
            }

            System.out.println("Минимальное значение строки " + i + " = " + min);
            System.out.println("Максимальное значение строки " + i + " = " + max);

            twoB[i][0] = min;
            System.out.println("Минимальное значение в новом массиве с индексом [" + i + ":0] = " + min);
            twoB[i][1] = max;
            System.out.println("Максимальное значение в новом массиве с индексом [" + i + ":1] = " + max);
        }
        for (i = 0; i < 5; i++) {
           for (j = 0; j < 2; j++) {
         System.out.print(twoB[i][j] + " ");
           }
         System.out.println();
        }

    }

        public static int getRandom ( int i) {
            double r = Math.random() * i;
            int rand = (int) r;
            return rand;
        }
}
