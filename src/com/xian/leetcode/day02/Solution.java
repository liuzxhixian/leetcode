package com.xian.leetcode.day02;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiancreate
 * @create 2020-11-03 15:46
 * @Description:
 */
public class Solution {

    public int oddCells(int n, int m, int[][] indices) {
        int sum = 0;
        if (indices.length > 1) {
            Map<Integer,Integer> col = new HashMap<>();
            Map<Integer,Integer> row = new HashMap<>();
            int rowSums = 0;
            for (int i = 0; i < indices.length; i++) {

                Integer rowNums = row.get(indices[i][0]);
                int rowCount = 1;
                if (rowNums != null) {
                    rowCount += rowNums;
                }
                row.put(indices[i][0],rowCount);

                Integer colNums = col.get(indices[i][1]);
                int colCount = 1;
                if (colNums != null) {
                    colCount += colNums;
                }
                col.put(indices[i][1],colCount);
            }
            for (Map.Entry<Integer,Integer> entry : row.entrySet()) {
                System.out.print(entry.getValue()+",");
                if (entry.getValue() % 2 == 1) {
                    sum += m;
                    rowSums++;
                }
            }

            for (Map.Entry<Integer,Integer> entry : col.entrySet()) {
                System.out.print(entry.getValue()+",");
                if (entry.getValue() % 2 == 1) {
                    sum += n - 2 * rowSums;
                }
            }
        }
        if (indices.length == 1) {
            return (n + m - 2);
        }
        if (indices.length == 0) {
            return 0;
        }
        return sum;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        for (int i = left; i <= right; i++) {
            String s = String.valueOf(i);
            if (s.contains("0")) {
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                int c = Integer.parseInt(String.valueOf(s.charAt(j)));
                if ( i % c != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
            flag = true;
        }
        return list;
    }

    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int p = x % 10;
            ans = ans * 10 + p;
            x /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] test = {{0,0},{1,1}};
//        int i = solution.oddCells(2, 2, test);
//        System.out.println(i);
//        long a = System.currentTimeMillis();
//        List<Integer> list = solution.selfDividingNumbers(1, 22);
//        long b = System.currentTimeMillis();
//        System.out.println(b - a);

        int reverse = solution.reverse(-123);
        System.out.println(reverse);
    }

}
