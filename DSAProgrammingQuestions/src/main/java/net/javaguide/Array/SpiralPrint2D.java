package net.javaguide.Array;

public class SpiralPrint2D {
    public static void printSpiral(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.println(matrix[top][i] + " ");
            }
            top++;
        }
        for (int i = top; i <= bottom; i++) {
            System.out.println(matrix[i][right] + " ");
        }
        right--;
    }

    public static void main(String args[]) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("SPIRAL MATRIX");
        printSpiral(matrix);
    }
}
