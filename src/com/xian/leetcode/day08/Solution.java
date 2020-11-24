package com.xian.leetcode.day08;

/**
 * @author xiancreate
 * @create 2020-11-20 17:04
 * @Description:
 */
public class Solution {

    public ListNode insertionSortList(ListNode head) {

        while(head.next != null) {
            ListNode nextNode = head.next;
            int headValue = head.val;
            int nextValue = nextNode.val;

        }

        return null;
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
