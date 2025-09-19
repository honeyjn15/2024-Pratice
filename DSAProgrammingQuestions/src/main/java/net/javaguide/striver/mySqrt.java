package net.javaguide.striver;

public class mySqrt {
    public static void main(String args[]) {

        int x = 64;
        int result = mySqrt(x);
        System.out.println(result);

    }

    public static int mySqrt(int x) {
        if (x < 2) return x; // 0 or 1 edge case

        int left = 0, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = (left+right)/2; // avoid overflow
            long sq = (long) mid * mid; // cast to long to avoid overflow

            if (sq == x) {
                return mid; // perfect square
            } else if (sq < x) {
                ans = mid;     // candidate answer
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

}
