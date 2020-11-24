package com.xian.leetcode.day09;


import java.util.ArrayList;
import java.util.List;

/**
 * @author xiancreate
 * @create 2020-11-22 12:42
 * @Description:
 */
public class Solution {

    public String convert(String s, int numRows) {

        if (s.length() < 2) {
            return s;
        }

        List<StringBuilder> lineString = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            lineString.add(new StringBuilder());
        }

        int i = 0,flag = -1;
        for (char c : s.toCharArray()) {
            lineString.get(i).append(c);
            if (i == 0 || i == numRows -1) {
                flag = -flag;
            }
            i += flag;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : lineString) {
            result.append(stringBuilder);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(2 << 2);
    }


}
