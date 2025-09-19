package net.javaguide.Array;

import java.util.Scanner;

 class PyramidProgram {
    public static void printStar(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {

                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printStar(n);
        }
    }
}
