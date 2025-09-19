package net.javaguide.String;

public class LeftSumRightSum {
    private static int findTheStableState(int[] arr) {

        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr) {
            totalSum = totalSum + num;
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum - arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum = leftSum + arr[i];
        }
        return -1;
    }


    public static  void main (String args[]){
        int[]arr ={4,3,2,1,9};
        int index =findTheStableState(arr);
        System.out.println("LeftSumRightSum" +index);
    }
}
