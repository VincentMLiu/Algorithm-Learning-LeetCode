/**
//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
// Related Topics 递归 链表 👍 155 👎 0

*/

package com.xixi.easy;
public class ID_Offer_25_HeBingLiangGePaiXuDeLianBiaoLcof {
public static void main(String[] args) {
Solution solution = new ID_Offer_25_HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
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
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    /**
     * 递归
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null) return l2;
        if(l2==null) return l1;

        if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;

        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    /**
     * 非递归
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

        if(l1==null) return l2;
        if(l2==null) return l1;

        ListNode newHead = new ListNode();

        ListNode p= newHead;
        ListNode p1= l1;
        ListNode p2 = l2;

        while(p1 !=null && p2 !=null){ //两链表均没到头
            if(p1.val <= p2.val){
                p.next = p1;
                p1 = p1.next;
            }else{
                p.next = p2;
                p2 = p2.next;
            }
            p =  p.next; //位移新链表指针;
        }

        if(p1 == null){
            p.next = p2;
        }
        if(p2 == null){
            p.next = p1;
        }

        return newHead.next;

    }


}
//leetcode submit region end(Prohibit modification and deletion)




}