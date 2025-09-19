package net.javaguide.java8;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,10};
        int n =10;
        int expectedSum = (n*(n+1))/2;

        int actualSum = Arrays.stream(arr).sum();

        int missingSum = expectedSum-actualSum;

        System.out.println(missingSum);
    }
}
