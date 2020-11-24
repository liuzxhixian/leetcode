package com.xian.leetcode.day08;

import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

import java.util.Arrays;

/**
 * @author xiancreate
 * @create 2020-11-20 21:08
 * @Description:
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int reverse = solution1.reverse(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse);
    }

    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }



}
