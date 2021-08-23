/**
//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数
//将返回左旋转两位得到的结果"cdefgab"。 
//
// 
//
// 示例 1： 
//
// 输入: s = "abcdefg", k = 2
//输出: "cdefgab"
// 
//
// 示例 2： 
//
// 输入: s = "lrloseumgh", k = 6
//输出: "umghlrlose"
// 
//
// 
//
// 限制： 
//
// 
// 1 <= k < s.length <= 10000 
// 
// Related Topics 数学 双指针 字符串 👍 144 👎 0

*/

package com.xixi.easy;
public class ID_OfferII_58_ZuoXuanZhuanZiFuChuanLcof {
public static void main(String[] args) {
Solution solution = new ID_OfferII_58_ZuoXuanZhuanZiFuChuanLcof().new Solution();
}


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseLeftWords(String s, int n) {

        char[] sChar = s.toCharArray();
        int l = sChar.length;



        char[] newSChar = new char[l];

        int i = n;
        int j = 0;

        //先将n赋值给i，先把原数组的后半段n -> （l-1）填充到新数租

        while( i < l){
            newSChar[j] = sChar[i];
            ++i;
            ++j;

        }

        //i回头，去读取前半段数据来填充新数组
        i = 0;
        while( i < n){
            newSChar[j] = sChar[i];
            ++i;
            ++j;
        }

        return new String(newSChar);
    }
}
//leetcode submit region end(Prohibit modification and deletion)




}