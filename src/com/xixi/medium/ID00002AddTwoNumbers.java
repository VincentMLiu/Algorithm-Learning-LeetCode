/**
//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
// Related Topics 递归 链表 数学 👍 6675 👎 0

*/

package com.xixi.medium;

import com.xixi.dataStructure.lineList.ListNode;

public class ID00002AddTwoNumbers {
public static void main(String[] args) {
Solution solution = new ID00002AddTwoNumbers().new Solution();
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode newHead = new ListNode();

        ListNode p = newHead; //新链表的虚拟头节点
        ListNode p1 = l1; //l1指针
        ListNode p2 = l2; //l2指针

        //首次循环到较短的链表结束
        int carry = 0; //进位
        while(p1 !=null && p2 !=null){
            int sum = p1.val + p2.val + carry;
            p.next = new ListNode(sum%10, null); //新链表节点
            carry = sum/10;

            p = p.next; //位移
            p1 = p1.next;
            p2 = p2.next;
        }

        //处理长链表剩余位数
        if(p1 == null){
            while(p2 !=null){
                int sum = p2.val + carry;
                p.next = new ListNode(sum%10, null); //新链表节点
                carry = sum/10;

                p = p.next; //位移
                p2 = p2.next;
            }
        }
        if(p2 == null){
            while(p1 !=null){
                int sum = p1.val + carry;
                p.next = new ListNode(sum%10, null); //新链表节点
                carry = sum/10;

                p = p.next; //位移
                p1 = p1.next;
            }
        }

        if(carry != 0) {
            p.next = new ListNode(1, null);
        }

        return newHead.next;

    }
}
//leetcode submit region end(Prohibit modification and deletion)




}