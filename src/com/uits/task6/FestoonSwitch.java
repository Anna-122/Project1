/*Переписать гирлянду используя оператор switch для выбора нужной операции..*/

package com.uits.task6;

public class FestoonSwitch {
    public static void main( String[] args ) {
        int festoon = 456;
        int mask = 1;
        //int i=0;
        int iterationNumber =(int) Double.parseDouble(args[1]);
        System.out.println(" вы вызываете метод "+ args[0] +iterationNumber + " раз(a) ");
        switch (args[0]) {
            case "blink":
                System.out.println("вариант А");
                System.out.println("исходное значение = " + festoon);
                System.out.println("перевод в двоичную систему = " + Integer.toBinaryString(festoon));
                for(int i=0; i < iterationNumber;  i++){
                    festoon=festoonBlink(festoon);
                    System.out.println("вызов метода Мигание гирлянды  " + iterationNumber + "раз (a)" + festoonBlink(festoon));
                    System.out.println("Мигаем гирляндой  " + i + " й раз = " + Integer.toBinaryString(festoon));

                }
                //System.out.println("значение после инверсии = " + Integer.toBinaryString(festoonBlink(festoon)));
                break;
            case "shift":
                System.out.println("вариант Б");
                System.out.println("исходное значение = " + festoon);
                System.out.println("перевод в двоичную систему значения festoon = " + Integer.toBinaryString(festoon));
                for(int i=0; i < iterationNumber;  i++){
                    festoon=festoonTicker(festoon);
                    System.out.println("вызов метода Бегущая строка = " + iterationNumber + "раз(a)" + festoonTicker(festoon));
                    System.out.println("Сдвиг гирлянды вправо " + i + " й раз = " + Integer.toBinaryString(festoon));
                }
               // System.out.println("преобразование метода 'Бегущая строка'  в двоичную систему= " + Integer.toBinaryString(festoonTicker(festoon)));
                break;

            case "mask":
                System.out.println("вариант В");
                System.out.println("исходное значение = " + festoon);
                System.out.println("перевод в двоичную систему значения garland = "  + Integer.toBinaryString(festoon));
                    System.out.println("вызов метода Наложение маски (состояние первой лампочки с права) = " + festoonMask(festoon, mask));
                    if (festoonMask(festoon, mask) > 0) {
                        System.out.println(" лампочка  горит");
                    } else {
                        System.out.println(" лампочка не горит");

                    }
                break;
            default:
                System.out.println("этого метода не существует");

        }

    }


    public static int festoonBlink( int f ) {
        return ~f;
    }

    public static int festoonTicker( int festoon ) {
        return festoon >> 1;
    }

    public static int festoonMask( int festoon, int mask ) {
        return festoon & mask;
    }
}

