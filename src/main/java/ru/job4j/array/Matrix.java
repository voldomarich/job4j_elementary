package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
            matrix[row][cell] = (row + 1) * (cell + 1);
            }
            }
        return matrix;
    }

    public static void main(String[] args) {
        String arrayString = Arrays.deepToString(Matrix.multiple(3));
        System.out.println(arrayString);
    }
}
