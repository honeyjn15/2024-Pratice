package net.javaguide.Array;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }

        if(nums.length == 1){
            if (nums[1] !=val){
                return 0;
            }
        }


        int k =0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
            }
        }
        return k+1;
    }

    public static void main(String args[]) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {0, 1, 2, 3, 3, 4, 4, 5};
         int val = 2;
        removeElement.removeElement(nums, val);
    }
}
