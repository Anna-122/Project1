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

public abstract class PlayInstruments implements Instrument {
    public static void main( String[] args ) {

        Instrument[] musicTools = new Instrument[6];
        musicTools[0] = new Guitar(15);
        musicTools[1] = new Trumpet(40);
        musicTools[2] = new Drum(86);
        musicTools[3] = new Drum(86);
        musicTools[4] = new Trumpet(40);
        musicTools[5] = new Guitar(15);

        for (int i = 0; i < musicTools.length; i++) {
//            Instrument a = musicTools[i]();
//            a.play();
            musicTools[i].play();
        }
    }
}
