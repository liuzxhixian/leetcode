package com.xian.leetcode.day04;

import java.util.*;

/**
 * @author xiancreate
 * @create 2020-11-05 15:50
 * @Description:
 */
public class Solution {

    public int heightChecker(int[] heights) {

        return 0;
    }

    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Map<Integer, Integer> valueToCount = new TreeMap<>(new ValueComparator(map));
        for (int i = 0; i < nums.length; i++) {
            Integer c = map.get(nums[i]);
            int count = 1;
            if (c != null) {
                count += c;
            }
            map.put(nums[i], count);
        }
        valueToCount.putAll(map);
        int[] result = new int[nums.length];
        int index = 0;
        for (Map.Entry<Integer,Integer> entry : valueToCount.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result[index] = entry.getKey();
                index++;
            }
        }
        return result;
    }
    class ValueComparator implements Comparator<Integer> {
        Map<Integer,Integer> valueToCount;
        public ValueComparator(Map<Integer,Integer> valueToCount) {
            this.valueToCount = valueToCount;
        }
        @Override
        public int compare(Integer o1, Integer o2) {
            int result = Integer.compare(valueToCount.get(o1),valueToCount.get(o2));
            return result == 0 ?
                    Integer.compare(o2,o1):
                    result;
        }
    }

    /** @author xiancreate
    * @description: 回文数
    * @Date: 17:11 2020/11/5
    * $param: [x]
    * $return: boolean
    */
    public boolean isPalindrome(int x) {
        int value = x;
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            result = result * 10 + pop;
            x /= 10;
        }
        return value / result == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
//        int[] ints = solution.frequencySort(nums);
//        System.out.println(Arrays.toString(ints));

//        int[] heights = {2,1,2,1,1,2,2,1};
//        int i = solution.heightChecker(heights);
//        System.out.println(i);

        boolean palindrome = solution.isPalindrome(-121);
        System.out.println(palindrome);
    }

}


