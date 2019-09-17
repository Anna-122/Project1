/*Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
Для преобразования из String в double используйте метод Double.parseDouble(String s).*/

package com.uits.task5;

public class AverageValue {
    public static void main(String[] args) {
       double a = Double.parseDouble(args[0]);
       double b = Double.parseDouble(args[1]);
       double c = Double.parseDouble(args[2]);

//        System.out.println("Первый арумент = " + a);
//        System.out.println("Второй арумент = " + b);
//        System.out.println("Третий арумент = " + c);

        System.out.println("Среднее арифметическое значение = " + (a + b + c) / 3);


    }
}

