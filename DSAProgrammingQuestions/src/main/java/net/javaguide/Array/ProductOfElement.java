package net.javaguide.Array;

//https://www.youtube.com/watch?v=G9zKmhybKBM

/*Initialization:
leftProducts[0] = 1: The first element has no elements to the left, so the product of "nothing" is defined as 1 for the sake of multiplication.
Index 1 (i = 1):
Compute leftProducts[1]:
Use the previously stored leftProducts[0], which is 1 (product of elements before arr[0]).
Multiply leftProducts[0] by arr[0], which is 10.
Therefore, leftProducts[1] = leftProducts[0] * arr[0] = 1 * 10 = 10.
At index 1, the product of all elements to the left of arr[1] (which is the element 3) is 10.
Index 2 (i = 2):
Compute leftProducts[2]:
Use the previously stored leftProducts[1], which is 10 (product of elements before arr[1]).
Multiply leftProducts[1] by arr[1], which is 3.
Therefore, leftProducts[2] = leftProducts[1] * arr[1] = 10 * 3 = 30.
At index 2, the product of all elements to the left of arr[2] (which is the element 5) is 30.
Index 3 (i = 3):
Compute leftProducts[3]:
Use the previously stored leftProducts[2], which is 30.
Multiply leftProducts[2] by arr[2], which is 5.
Therefore, leftProducts[3] = leftProducts[2] * arr[2] = 30 * 5 = 150.
At index 3, the product of all elements to the left of arr[3] (which is the element 6) is 150.
Index 4 (i = 4):
Compute leftProducts[4]:
Use the previously stored leftProducts[3], which is 150.
Multiply leftProducts[3] by arr[3], which is 6.
Therefore, leftProducts[4] = leftProducts[3] * arr[3] = 150 * 6 = 900.
At index 4, the product of all elements to the left of arr[4] (which is the element 2) is 900.Array*/
public class ProductOfElement {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 6};
        int n = arr.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] resultantProduct = new int[n];

        //left product at 0th location is kept as 1
        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * arr[i - 1];
        }

        //right product at n-1th location is kept as 1 it means last location of array
        rightProduct[n-1] = 1;
        for (int i = n-2; i >=0; i--) {
            rightProduct[i] = rightProduct[i + 1] * arr[i + 1];
        }

        for(int i=0;i<n;i++){
            resultantProduct[i] = rightProduct[i] * leftProduct[i];
            System.out.println("answer--->"  +resultantProduct[i]);
        }



    }
}



