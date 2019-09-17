package com.uits.task7;

public class EarlyTermination {
    public static void main( String[] args ) {
        int arrayLen = (int)Double.parseDouble(args[0]);
        int [] array= new int[arrayLen];
        System.out.println("Заполняем исходный массив с размером " + arrayLen + " случайными значениями");
        for (int i = 0 ; i < array.length; i++) {
            array[i] = getRandom(100);
            System.out.println(i+"й " + "элемент: " + array[i]);
         }
        System.out.println("Сортируем массив: Находим максимальное значенее и выталкивем его на верх массива, в индекс " + (array.length-1));
        sortingArray(array);
        for (int i = 0 ; i < array.length; i++) {
            System.out.println(i+"й " + "элемент: " + array[i]);
        }
    }
    private static void sortingArray (int[] array){
//        System.out.println(array.length);
//        System.out.println(array[0]);
        for (int i = 1; i < array.length; i++) {
//            if (i == 0) {
//                 System.exit(0);
//              }
            if (array[i - 1] > array[i]) {
                 int tmp = array[i - 1];
                 array[i - 1] = array[i];
                 array[i] = tmp;
            }
        }
     }

     public static int getRandom (int i){
        double r = Math.random() * i;
        int rand = (int) r;
        return rand;
     }
}


