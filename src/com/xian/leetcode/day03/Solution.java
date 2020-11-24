package com.xian.leetcode.day03;

import com.sun.javafx.logging.JFRInputEvent;

/**
 * @author xiancreate
 * @create 2020-11-04 16:38
 * @Description:
 */
public class Solution {

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        if (moves.length() % 2 != 0) {
            return false;
        }
        if (moves.length() % 2 == 0) {
            for (int i = 0; i < moves.length(); i++) {
                switch (moves.charAt(i)) {
                    case 'L':x += -1;break;
                    case 'R':x += 1;break;
                    case 'U':y += -1;;break;
                    case 'D':y += 1;;break;
                }
            }
        }
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }

    public String longestCommonPrefix(String[] strs) {
        String pre = "";
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 0) {
            return "";
        }
        if (strs.length > 1) {
            for (int i = 1; i < strs.length; i++) {


            }
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        boolean lrud = solution.judgeCircle("LRU");
//        System.out.println(lrud);
        String[] strs = {"flower","flower","flower","flower"};
        String[] strs1 = {"dog","racecar","car"};
        String s = solution.longestCommonPrefix(strs);
        System.out.println(s);
        String str = "flower";
//        System.out.println(str.startsWith("flow"));

    }

}
