package com.yaole.problems.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray_448 {
    public static void main(String[] args) {
        int[] nums = new int[] {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int n = nums.length;
        int[] arr = new int[n];

        //将数组全部填充为0
        Arrays.fill(arr, 0);

        for (int i = 0; i < n; i++) {
            arr[nums[i] - 1] = nums[i];
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] == 0) {
                result.add(j + 1);
            }
        }

        return result;
    }
}

