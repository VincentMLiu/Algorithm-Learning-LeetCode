/**
//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 示例 4： 
//
// 
//输入：x = -101
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 
// 👍 1592 👎 0

*/

package com.xixi.easy;

import java.util.ArrayList;
import java.util.List;

public class ID00009PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new ID00009PalindromeNumber().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {

        //特殊情况
        if (x < 0)
            return false;
        if (x >= 0 && x < 10)
            return true;

        List<Integer> lst = new ArrayList<>();

        int s = 0;

        //x每次除以10的余数放到数组里123456的数组就是[6,5,4,3,2,1]，数组正反不影响回文串判断
        while(x > 0){
            s = x % 10;
            lst.add(s);
            x /= 10;
        }

        int i = 0;
        int j = lst.size() -1;
        //双指针判断是否回文
        while(i < j){
            int a = lst.get(i);
            int b = lst.get(j);

            if(a != b) return false;

            ++i;
            --j;

        }

        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}
