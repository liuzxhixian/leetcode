package com.xian.leetcode.day01;

/**
 * @author xiancreate
 * @create 2020-11-02 19:39
 * @Description:
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val,ListNode next) {
        this.val = val;
        this.next = next;
    }
}
