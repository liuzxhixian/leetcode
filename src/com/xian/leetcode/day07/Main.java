package com.xian.leetcode.day07;

import java.util.*;

/**
 * @author xiancreate
 * @create 2020-11-17 16:58
 * @Description:
 */
public class Main {


    public void print() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= num + 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] ints = twoSum(nums, 6);
        System.out.println(Arrays.toString(ints));

    }

    /**
     *给出一个非负整数数组，你最初在数组第一个元素的位置
     *
     * 数组中的元素代表你在这个位置可以跳跃的最大长度
     * 判断你是否能到达数组最后一个元素的位置
     * 例如
     * A =[2,3,1,1,4], 返回 true.
     *
     * A =[3,2,1,0,4], 返回 false.
     * @param A int整型一维数组
     * @return bool布尔型
     */
    public boolean canJump (int[] A) {
        if (A.length == 1) {
            return true;
        }

        int j = 0;
        while (j < A.length - 1) {
            if (A[j] == 0) {
                return false;
            }
            j = j + A[j];
        }
        if (j >= A.length - 1) {
            return true;
        }
        return false;
    }

    /**
     *题目描述
     * 给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
     * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
     * 假设给出的数组中只存在唯一解
     * 例如：
     * 给出的数组为 {20, 70, 110, 150},目标值为90
     * 输出 index1=1, index2=2
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public static int[] twoSum (int[] numbers, int target) {
        int[] num = {};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {

//            if (map.containsValue((target - numbers[i]))) {
//                num = new int[2];
//                num[0] = i;
//                num[1] = map.get(target - numbers[i]);
//                return num;
//            }
            map.put(i,numbers[i]);
        }
        return num;
    }



}
