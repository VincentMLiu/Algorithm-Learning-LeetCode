package com.xixi.easy;//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics 字符串 👍 151 👎 0


public class IDOffer_05_TiHuanKongGeLcof {
    public static void main(String[] args) {
        Solution solution = new IDOffer_05_TiHuanKongGeLcof().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String replaceSpace(String s) {

            char[] sChar = s.toCharArray();
            char[] newSchar = new char[sChar.length * 3];

            int i = 0;
            int j = 0;
            while(j < sChar.length){
                if(sChar[j] == ' '){
                    newSchar[i] = '%';
                    ++i;
                    newSchar[i] = '2';
                    ++i;
                    newSchar[i] = '0';
                    ++i;
                    ++j;
                    continue;
                }
                newSchar[i] = sChar[j];
                ++i;
                ++j;

            }

            return  new String(newSchar).trim();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}


