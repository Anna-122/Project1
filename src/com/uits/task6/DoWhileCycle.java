/*Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.*/
package com.uits.task6;

public class DoWhileCycle {
    public static void main(String args[]) {
        int x = 1;
        do {
            int r = x * 5;
            System.out.print("Итерация №" + x + ". Число, которoe делиться на 5 без остатка: " + r);
            x++;
            System.out.print("\n");
        }
        while (x*5 < 105);
    }
}

