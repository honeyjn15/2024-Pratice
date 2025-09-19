package net.javaguide.Array;

public class RemoveDuplicate {

    public int removeDuplicate(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }


        int k = 0;

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i + 1] - nums[i] != 0) {
                k++;

                nums[k] = nums[i+1];
            }
        }
        System.out.println("value of k" + k);
        return k+1;
    }

    public static void main(String args[]) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] nums = {0, 1, 2, 3, 3, 4, 4, 5};
        removeDuplicate.removeDuplicate(nums);
    }
}
