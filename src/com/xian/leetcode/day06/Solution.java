package com.xian.leetcode.day06;

/**
 * @author xiancreate
 * @create 2020-11-16 16:35
 * @Description:
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {

            if (Math.abs(nums[i]) > Math.abs(target)) {
                continue;
            }
            int v1 = nums[i];
            boolean flag = false;
            for (int j = i + 1; j < nums.length; j++) {
                if ((v1 + nums[j]) == target ) {
                    arr[0] = i;
                    arr[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }

}
