package net.javaguide.Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String args[]) {
        int k = 3;
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        rotateFromKthPosition(nums, k);
    }

    private static int[] rotateFromKthPosition(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;

        int[] result = new int[nums.length];
        int indx = 0;
        for (int i = n - k; i <= nums.length - 1; i++) {

            result[indx++] = nums[i];

        }
        System.out.println("first loop---->" + Arrays.toString(result));

        for (int i = 0; i <= n - k - 1; i++) {
            result[indx++] = nums[i];
        }
        System.out.println("Second loop---->" + Arrays.toString(result));
        return result;

    }

}
