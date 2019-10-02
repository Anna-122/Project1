/*
Создать интерфейс "Инструмент" и реализующие его классы:
*Гитара
*Барабан
*Труба

Интерфейс "Инструмент" содержит:
*метод play()
*переменную String KEY ="До мажор".

Класс "Гитара" содержит переменные класса:
*количество Струн

Класс "Барабан" содержит переменные класса:
*размер

Класс "Труба" содержит переменные класса:
*диаметр


Создать массив типа Инструмент, содержащий инструменты разного типа.
В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
 */

package com.uits.task12;

public class PlayInstruments implements Instrument {
    public static void main( String[] args ) {
        Instrument[] musicTools = new Instrument[5];
        musicTools[0] = new Instrument.Guitar(15);

        Guitar guitar = new Guitar(15) {
        };
        Trumpet trumpet = new Trumpet(40) {
        };
        Drum drum = new Drum(86) {
        };

        guitar.play();
        System.out.println();

        trumpet.play();
        System.out.println();

        drum.play();


        Instrument[] tools = new Instrument[2];
        for (int i = 0; i < 3; i++) {
             guitar.play();
             trumpet.play();
             drum.play();

        }
    }
}
