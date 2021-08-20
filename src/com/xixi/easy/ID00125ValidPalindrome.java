/**
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 
//
// 示例 1: 
//
// 
//输入: "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串
// 
//
// 示例 2: 
//
// 
//输入: "race a car"
//输出: false
//解释："raceacar" 不是回文串
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 105 
// 字符串 s 由 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 
// 👍 405 👎 0

*/

package com.xixi.easy;

public class ID00125ValidPalindrome {
    public static void main(String[] args) {


        String s = "A man, a plan, a canal: Panama";

        Solution solution = new ID00125ValidPalindrome().new Solution();
        solution.isPalindrome(s);

    }



    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public boolean isPalindrome(String s) {

        if(s == null) return false;
        if(s.length() <=1 ) return true;
        int i =0,j= s.length() -1;
        char[] sChar = s.toLowerCase().toCharArray();



        while(i<j){
            while(!Character.isLetterOrDigit(sChar[i])
             && (i < j)
            ){
                ++i;
            }
            while(!Character.isLetterOrDigit(sChar[j])
                    && (i < j)
            ){
                --j;
            }

            char a = sChar[i];
            char b = sChar[j];

            if(a != b)
                return false;
            ++i;
            --j;
        }


        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}
