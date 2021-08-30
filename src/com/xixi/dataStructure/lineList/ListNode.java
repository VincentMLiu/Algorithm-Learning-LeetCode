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

    public ListNode head = new ListNode(); //哨兵节点，虚拟头节点
    public ListNode tail;
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * 遍历
     * @param head
     */
    public void traverse(ListNode head){

        ListNode p = head;
        while(p !=null ){
            System.out.println(p.val);
            p = p.next;
        }
    }

    /**
     * 查找
     * @param value
     * @return
     */
    public ListNode find(int value){
        ListNode p = head;
        while(p !=null){
            if(p.val == value) return p;
            p = p.next;
        }

        return null;
    }

    /**
     * 头部插入
     * @param value
     */
    public void insertHead(int value){
        ListNode newNode = new ListNode(value, null);
        newNode.next = head;
        head = newNode;

    }

    /**
     * 尾部插入
     * @param value
     */
    public void insertTail(int value){
        ListNode newNode = new ListNode(value, null);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * 引入虚拟头节点
     */
    public void insertTail3(int value){
        ListNode newNode = new ListNode(value, null);
        tail.next = newNode;
        tail = newNode;
    }

    /**
     * 某节点之后插入元素
     * @param p
     * @param value
     */
    public void insertAfter(ListNode p, int value){

        if(p == null){
            return;
        }
        ListNode newNode = new ListNode(value, null);
        newNode.next = p.next;
        p.next = newNode;

    }

    /**
     * 删除某节点之后的节点
     * @param p
     */
    public void deleteNextNode(ListNode p){
        if(p ==null || p.next ==null){
            return;
        }
        p.next = p.next.next;
    }

    /**
     * 删除给定节点
     * @return
     */
    public ListNode deleteThisNode(ListNode p){
        if(p ==null || head.next == null) return null;
        ListNode prev = null;

        ListNode q = head;
        //遍历找到该节点
        while(q!=null){
            if(q==p){
                break;
            }
            prev = q;//往后移动
            q = q.next;

        }

        if(q ==null){
            return head; //没找到
        }else {
            prev.next = prev.next.next;//找到了就删除当前的
        }

        return head;

    }

}
