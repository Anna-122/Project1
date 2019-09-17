/*
Организовать в ввиде цикла следующие методы:
a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);

*/


package com.uits.task5;

public class FestoonFor {
    public static void main( String[] args ) {

        System.out.println("вариант Б");
        int festoon = 562;
        System.out.println("Исходное состояние гирлянды = " + Integer.toBinaryString(festoon));
        for (int ticker = 1; ticker < 11; ticker++) {
            festoon=festoonTicker(festoon);
            System.out.println("Сдвиг гирлянды вправо " + ticker + "й раз = " + Integer.toBinaryString(festoon));
        }

        System.out.println("");


        System.out.println("вариант А");
        festoon = 836;
        System.out.println("Исходное состояние гирлянды = " + Integer.toBinaryString(festoon));
        for (int blink = 1; blink < 5; blink++) {
            festoon=festoonBlink(festoon);
            System.out.println("Мигаем гирляндой  " +blink+ "й раз = " + Integer.toBinaryString(festoon));
        }
    }

    public static int festoonTicker( int f ) {
        return  f >> 1;
    }
    public static int festoonBlink( int f ) {
        return  ~f;
    }
}
