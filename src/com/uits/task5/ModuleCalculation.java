/*Создать программу, которая будет выводить на экран меньшее по модулю
из трёх введённых пользователем вещественных чисел.
Для вычисления модуля используйте тернарную условную операцию.*/

package com.uits.task5;

import java.util.Scanner;

public class ModuleCalculation {
    public static void main( String[] args ) {

        int a = 0;
        while (a == 0) {
            a = intScan();
            System.out.println("Ошибка. Повторите ввод");
        }
        a = a < 0 ? -a : a;
        System.out.println("Модуль = "+ a);


        int b = 0;
        while (b == 0) {
            b = intScan();
            System.out.println("Ошибка. Повторите ввод");
        }
        b =  b < 0 ? -b : b;
        System.out.println("Модуль = "+ b);

        int c = 0;
        while (c == 0) {
            c = intScan();
            System.out.println("Ошибка. Повторите ввод");
        }
        c =  c < 0 ? -c : b;

        System.out.println("Модуль = "+ c);
        int min = a < b ? a : b;
        min = min < c ? min : c;
        System.out.println("Минимальное (по модулю) значение: "+ min);
    }


    static int intScan() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        }
        return i;
    }
}
