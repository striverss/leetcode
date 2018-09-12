package com.yaole.problems.Sort;

import java.util.*;

public class IntersectionOfTwoArrays_349 {
    /**
     * 先对较长数组排序
     * 然后对短数组去重
     * 最后在长数组中对短数组的每个元素进行二分查找
     * 返回存在的元素
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;
        Arrays.sort(nums1);
        Set<Integer> set = new HashSet<>();
        for (int num : nums2) {
            if (Arrays.binarySearch(nums1, num) >= 0) set.add(num);
        }
        int[] result = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            result[i++] = iterator.next();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
