package com.xian.leetcode.day01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xiancreate
 * @create 2020-11-02 16:35
 * @Description:
 */
public class Solution {

    public int numJewelsInStones(String J, String S) {
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        int count = 0;
        for (int i = 0;i < j.length; i++) {
            for (int k = 0; k < s.length; k++) {
                if (j[i] == s[k]) {
                    count++;
                }
            }
        }
        return count;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[0];
        int index = 0;
        int a = 0;
        for (int i=0 ; i < nums1.length; i++) {
            for (int j=0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (temp.length < 1) {
                        temp = new int[++index];
                        temp[a++] = nums1[i];
                    } else {
                        boolean flag = true;
                        for (int k = 0; k < temp.length; k++) {
                            if(temp[k] == nums1[i]) {
                                flag = false;
                            }
                        }
                        if (flag) {
                            temp = Arrays.copyOf(temp,temp.length+1);
                            temp[a++] = nums1[i];
                        }
                    }
                }
            }
        }
        return temp;

    }

    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        for (int i=0; i < sums.length; i++) {
            for (int j=0; j<=i;j++) {
                sums[i] += nums[j];
            }
        }
        return sums;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr = {};
        for (int i=0; i < nums.length; i++) {
            int v1 = nums[i];
            for (int j=0; j < nums.length; j++) {
                if (i != j) {
                    int v2 = nums[j];
                    if ((v1 + v2) == target) {
                        arr = new int[2];
                        arr[0] = j;
                        arr[1] = i;
                    }
                }
            }
        }
        return arr;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        double value = getValue(l1);
        double value1 = getValue(l2);
        double sum  = value + value1;
        String s1 = String.valueOf(sum);
        System.out.println(s1);
        ListNode listNode = setNode(s1);
        return listNode;
    }

    public static ListNode setNode(String value) {
        char[] chars = value.toCharArray();
        ListNode node = null;
//        for (int i = 0 ; i < chars.length/2; i++) {
//            char temp = chars[i];
//            chars[i] = chars[chars.length - i - 1];
//            chars[chars.length - i - 1] = temp;
//        }
        for (int i = 0; i < chars.length; i++) {
            if (node == null) {
                node = new ListNode(Integer.parseInt(String.valueOf(chars[i])));
            } else {
                node = new ListNode(Integer.parseInt(String.valueOf(chars[i])),node);
            }
        }
        return node;
    }

    public static double getValue(ListNode node) {
        String value = "";
        while (true) {
            if (node != null) {
                value += node.val;
                if (node.next != null) {
                    node = node.next;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        if (value.length() > 0) {
            char[] characters = value.toCharArray();
            for (int i = 0 ; i < characters.length / 2; i++) {
                char temp = characters[i];
                characters[i] = characters[characters.length - i - 1];
                characters[characters.length - i - 1] = temp;
            }
            value = String.valueOf(characters);
            System.out.println(value);
        }
        return Long.parseLong(value);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] a = {};
//        int[] b = {};
//        int[] intersection = solution.intersection(a, b);
//        System.out.println(intersection);

//        int[] nums = {1,2,3,4};
//        System.out.println(Arrays.toString(solution.runningSum(nums)));

//        int[] nums = {2,7,11,15};
//        int[] ints = solution.twoSum(nums, 9);
//        System.out.println(ints[0]);
//        System.out.println(Arrays.toString(ints));
        ListNode l1 = new ListNode();
        l1.val = 2;
        l1.next = new ListNode(4,new ListNode(3));
        ListNode l2 = new ListNode();
        l2.val = 5;
        l2.next = new ListNode(6,new ListNode(4));
        ListNode node = solution.addTwoNumbers(l1, l2);
        System.out.println(node.val+":"+node.next.val+":"+node.next.next.val);
    }
}
