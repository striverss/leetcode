package com.yaole.problems.Array;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 2, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int result = 1;
        int j = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[j]) {
                tmp = nums[j + 1];
                nums[j + 1] = nums[i];
                nums[i] = tmp;
                j = j + 1;
                result = j + 1;
                continue;
            }
            continue;
        }
        return result;
    }
}
