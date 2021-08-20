/**
//给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。 
//
// 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。 
//
// 
//
// 示例 1： 
//
// 输入：address = "1.1.1.1"
//输出："1[.]1[.]1[.]1"
// 
//
// 示例 2： 
//
// 输入：address = "255.100.50.0"
//输出："255[.]100[.]50[.]0"
// 
//
// 
//
// 提示： 
//
// 
// 给出的 address 是一个有效的 IPv4 地址 
// 
// Related Topics 字符串 
// 👍 67 👎 0

*/

package com.xixi.easy;
public class ID01108DefangingAnIpAddress {
    public static void main(String[] args) {
        Solution solution = new ID01108DefangingAnIpAddress().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String defangIPaddr(String address) {

        String newAddress = "";
        if(address == null || !address.contains(".")) return null;
        newAddress = address.replace(".","[.]");
        return newAddress;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}
