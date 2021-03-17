/**
//一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出
//这个数字。 
//
// 
//
// 示例 1: 
//
// 输入: [0,1,3]
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [0,1,2,3,4,5,6,7,9]
//输出: 8 
//
// 
//
// 限制： 
//
// 1 <= 数组长度 <= 10000 
// Related Topics 数组 二分查找 
// 👍 113 👎 0

*/

package com.xixi.easy;
public class IDOfferII_53_QueShiDeShu {
    public static void main(String[] args) {
        Solution solution = new IDOfferII_53_QueShiDeShu().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 0 ) return -1;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2; //分

            if(nums[mid] == mid){
                left = mid + 1;
            }else if(nums[mid] > mid){
                right = mid - 1;
            }
        }

        if(left == nums[nums.length-1] && nums[left] == left){
            return left + 1;
        }else{
            return left;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}
