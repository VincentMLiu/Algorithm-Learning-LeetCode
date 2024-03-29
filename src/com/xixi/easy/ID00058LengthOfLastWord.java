package com.xixi.easy;//给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
//
// 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Hello World"
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：s = "   fly me   to   the moon  "
//输出：4
// 
//
// 示例 3： 
//
// 
//输入：s = "luffy is still joyboy"
//输出：6
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅有英文字母和空格 ' ' 组成 
// s 中至少存在一个单词 
// 
// Related Topics 字符串 👍 343 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() -1;
        char[] sChar = s.toCharArray();


        //从尾部开始扫描，遇到非空格就停
        while( sChar[i] == ' '){
            --i;
        }
        int j = i;//记录位置

        //从非空格的倒数第一个字母开始扫描，遇到第一个空格或者到第一个字母就停下
        while(sChar[i] != ' ' && i > 0){
            --i;
        }

        int len = j-i;
        if(i==0 && sChar[0] != ' '){
            len = len + 1;
        }

        return  len;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
