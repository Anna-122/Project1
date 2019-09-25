package com.uits.task9;

public class MainMatrix {
    public static void main(String[] args) {
        // Тестирование первого конструктора
        Matrix matrix1 = new Matrix(4,5); // создание объекта
        Matrix matrix2 = new Matrix(6,3);

        // Тестирование второго конструктора
        int p = (int) (Math.random() * 7 + 2);
        int q = (int) (Math.random() * 7 + 2);
        double[][] ar = new double[p][q];
        System.out.println("Матрица2: ");
        test.fillMatrix(ar);                       // заполнение матрицы
        test.printMatrix(ar);                      // печать матрицы
        Matrix matrix2 = new Matrix(ar);      // создание объекта

    }

}
