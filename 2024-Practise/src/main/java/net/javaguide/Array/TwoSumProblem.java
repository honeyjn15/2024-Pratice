package net.javaguide.Array;

import java.util.HashSet;
import java.util.Set;

public class TwoSumProblem {
    public static void main(String args[]){
        int a[] = {1,5,6,2,9};
        int n= 8;
        Set<Integer> s =  new HashSet<>();
        for(int i =0; i<a.length; i++){
            int temp  = n-a[i];
            System.out.println(s);
            if(s.contains(temp)) {
                System.out.println("result is " + temp + ", " + a[i]);
                return;
            }
            s.add(a[i]);

        }
    }
}


