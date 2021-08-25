/**
//给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,6,3,4,5,6], val = 6
//输出：[1,2,3,4,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [], val = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [7,7,7,7], val = 7
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 列表中的节点数目在范围 [0, 10⁴] 内 
// 1 <= Node.val <= 50 
// 0 <= val <= 50 
// 
// Related Topics 递归 链表 👍 683 👎 0

*/

package com.xixi.easy;
public class ID00203RemoveLinkedListElements {
public static void main(String[] args) {
Solution solution = new ID00203RemoveLinkedListElements().new Solution();
}

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */




class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return head;


        ListNode newHead = head;
        ListNode prve = null;
        ListNode index = head;
        while (index.next !=null){
            if(index.val == val){ //需要删除，分两种情况
                if(prve == null){//如果第一个节点需要删除
                    newHead = index.next;//首节点直接指向下一个节点
                }else{//删除中间节点
                    prve.next = index.next;//直接指向下一个节点
                }
                //节点删除，前置节点不同，不删除，前置节点则往后移动
            }else{
                prve = index;
            }

            index = index.next;//指针向下移动一位；

        }//执行完循环，指针停在最后一个节点
        if(index.val == val){ //如果需要删除
            if(prve == null){//如果要删的也是第一个节点
                newHead = null; //head指向空
            }else{//如果不是第一个节点，直接把下个节点删除
                prve.next = null;
            }
        }




        return newHead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)




}