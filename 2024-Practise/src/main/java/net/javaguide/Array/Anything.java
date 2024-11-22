package net.javaguide.Array;


public class Anything {

    public static int maxSubArray(int[] arr, int k) {
        int windowSum = 0;

        if (arr.length < k) {
            return 0;
        }
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];

            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int arr[] = {7, 4, 3, 2, 9, 1, 5, 6};
        int k=3;
        int result =  maxSubArray(arr,k);
        System.out.println(result);
    }
}
