package net.javaguide.dynamicProgramming;

import java.util.*;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i <=numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow  = triangle.get(i - 1);

            // First element
            row.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            // Last element
            row.add(1);
            triangle.add(row);
        }

        return Collections.singletonList(triangle.get(numRows));
    }

    public static void main(String[] args) {
        PascalTriangle sol = new PascalTriangle();
        List<List<Integer>> result = sol.generate(5); // Example with 5 rows

        // Printing Pascal's triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
