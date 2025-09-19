package net.javaguide.Array;

import java.util.Arrays;

//LeetCode Program -> 80
public class RemoveDuplicateSortedArray2 {

    public static void main(String args[]) {

        int[] num = {1, 1, 1, 2, 2, 2,3};
        RemoveDuplicateSortedArray2 removeDuplicateSortedArray2 = new RemoveDuplicateSortedArray2();
        removeDuplicateSortedArray2.find(num);
    }

    private int find(int[] num) {
        int[] result = new int[num.length - 1];


        int indx =2;
        for (int i = 2; i <= num.length - 1; i++) {

            if (num[i] != num[indx - 2]) {
                result[indx++] = num[i];
            }
        }
        System.out.println(Arrays.toString(result));
        return indx;
    }
}
