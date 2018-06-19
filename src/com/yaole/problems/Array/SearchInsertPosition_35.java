package com.yaole.problems.Array;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] > target) {
            result = 0;
            return result;
        }
        if (nums[right] < target) {
            result = nums.length;
            return result;
        }
        while (left <= right) {
            int middle = (left + right) / 2;

            if (target < nums[middle]) {
                right = middle - 1;
                continue;
            }

            else if (target > nums[middle]) {
                left = middle + 1;
                continue;
            }

            else if (target == nums[middle]) {
                result = middle;
                return result;
            }

            continue;
        }

        result = left;
        return result;
    }
}
