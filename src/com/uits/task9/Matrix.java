package com.uits.task9;

public class Matrix {
    int column;
    int lines;
    double[][] matrix;

    // Первый конструктор
    public Matrix( int lin, int col) {
        lines=lin;
        column=col;
        double[][] matrix = new double[lines][column];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < column; j++) {
                matrix [i][j] = RandomFill(100);
                //System.out.print(matrix [i][j] + " ");
            }
            //System.out.println();
        }
    }

    // Второй конструктор
    public Matrix(double ar[][]) {
        matrix = ar;
        lines = matrix.length;
        column = matrix[0].length;
    }



    public double[][] getMatrix() {
        return matrix;
    }


    // Метод вывода массива на консоль
    public void printMatrix(double[][] matrix) {
        System.out.println("Вывод на печать матрицы обьекта");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public double RandomFill(int i){
        double r = Math.random() * i;
        return r;
    }
}





       /* matrix1 = new double[lines][column];

        int column2 = 4;
        int lines2 = 3;
        double matrix2[][];
        matrix2 = new double[lines2][column2];
    }


    public static int[][] sum( int[][] matrix1, int[][] matrix2 ) {
        int[][] sum = new int[2][2];
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix2.length; j++)
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
        return sum;
    }
}
    /*public static int[][] mult( int[][] matrix1) {
        //int[][] mult = new int[2][2];
        int mult=int matrix1[][];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                mult[i][j] = matrix1[i][j] * 5;
                return mult;
            }
        }


    }
}*/