package net.javaguide.Interview;

import java.util.stream.IntStream;

public class SumOfSquare {

    void rangeNumber(int start , int end){

        int sum = IntStream.rangeClosed(start,end).map(n->n*n).sum();
        System.out.println(sum);
    }

    public static void main(String[] args) {

        SumOfSquare s = new SumOfSquare();
        s.rangeNumber(2,5);

    }
}
