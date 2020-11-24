package com.xian.leetcode.day04;

import java.util.List;

/**
 * @author xiancreate
 * @create 2020-11-05 17:33
 * @Description:
 */
public class Solution2 {

    /**
     *
     *字符转换整除
     *如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
     * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
     * 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。
     *
     * */
    public int myAtoi(String s) {
        String str = s.trim();
        int result = 0;
        if (str.length() < 1) {
            return 0;
        }
        if (str.charAt(0) == '-') {
            if (str.charAt(1) > 57 || str.charAt(1) < 48) return 0;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i)>57 || str.charAt(i) < 48) {
                    str = str.substring(0,i);
                }
            }
            try {
                result = Integer.parseInt(str);
            } catch (Exception e) {
                result = Integer.MIN_VALUE;
            }
        } else  if(str.charAt(0) == '+') {
            if (str.charAt(1) > 57 || str.charAt(1) < 48) return 0;

                for (int i = 1; i < str.length(); i++) {
                    if (str.charAt(i) > 57 || str.charAt(i) < 48) {
                        str = str.substring(0, i);
                    }
                }
                try {
                    result = Integer.parseInt(str);
                } catch (Exception e) {
                    result = Integer.MAX_VALUE;
                }

        } else if (str.charAt(0)<=57 && str.charAt(0) >= 48) {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) > 57 || str.charAt(i) < 48) {
                    str = str.substring(0, i);
                }
            }
            try {
                result = Integer.parseInt(str);
            } catch (Exception e) {
                result = Integer.MAX_VALUE;
            }
        }
        return result;
    }

    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (haystack.contains(needle)) {
            String replace = haystack.replace(needle, "@");
            return replace.indexOf("@");
        }
        return -1;
    }

    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if (! wordList.contains(endWord)) {
            return 0;
        }

        for (String temp : wordList) {
            
        }



        return 0;
    }

    public int searchInsert(int[] nums, int target) {

        if (target > nums[nums.length]) {
            return nums.length;
        }
        if (target < nums[0]) {
            return 0;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > target && nums[i - 1] < target) {
                index = i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
//        int i = solution2.myAtoi("42");
//        System.out.println(i);
//        System.out.println(Integer.parseInt("+-42"));
        int i = solution2.strStr("mississippi", "issip");
        System.out.println(i);

    }
}
