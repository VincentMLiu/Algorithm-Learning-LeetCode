/**
//存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。 
//
// 返回同样按升序排列的结果链表。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,1,2]
//输出：[1,2]
// 
//
// 示例 2： 
//
// 
//输入：head = [1,1,2,3,3]
//输出：[1,2,3]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围 [0, 300] 内 
// -100 <= Node.val <= 100 
// 题目数据保证链表已经按升序排列 
// 
// Related Topics 链表 👍 632 👎 0

*/

package com.xixi.easy;
public class ID00083RemoveDuplicatesFromSortedList {
public static void main(String[] args) {
Solution solution = new ID00083RemoveDuplicatesFromSortedList().new Solution();
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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode i = head;
        if(head == null || head.next == null){//节点数目小于等于1
            return head;
        }


        while(i.next !=null){ //便利链表，直到移动到i.next为null;
            if(i.val == i.next.val){ //下一个为重复元素，i.next指针向下移动
                i.next = i.next.next;
            }else{
                i = i.next; //下一个为非重复元素，i指针向下移动
            }

        }


        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)




}