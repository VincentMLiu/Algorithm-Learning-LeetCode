package com.xixi.dataStructure.lineList;


/**
 * @Description: ListNode
 * @Author: VincentMLiu
 * @Date: 2021-08-26
 * @Version:v1.0
 */
public class ListNode {

    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
