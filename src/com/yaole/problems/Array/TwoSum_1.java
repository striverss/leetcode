package com.yaole.problems.Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length == 0 || nums == null) {
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            }
            else {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            }
        }
        return result;
    }
}
