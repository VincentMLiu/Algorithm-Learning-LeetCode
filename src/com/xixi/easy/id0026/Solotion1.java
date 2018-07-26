package com.xixi.easy.id0026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**  
* 26. Remove Duplicates from Sorted Array 
*  link：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/description/
*  
*  idea：
*  fast&slow cursor
*  [j] is slow cursor;
*  [i] is fast cursor;
*  when nums[j] == nums[i], i moves on;
*  when nums[j] != nums[i], assign the nums[i] value to nums[j+1], and j moves on.
*  repeat above procedure till  i reach the nums.length.
*  
* @author VincentMLiu 

* @date 2018年7月26日  

*/  

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        if (nums == null || nums.length == 0) {
            return 0;
        }

        for(int i = 1; i < nums.length ;i++){
            if (nums[j] != nums[i]) {
              nums[++j] = nums[i];  
            }
        }
        
        return j + 1;
    }
}


public class Solotion1 {
	
	
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().removeDuplicates(nums);
            String out = integerArrayToString(nums, ret);
            
            System.out.print(out);
        }
    }
	
	
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
}
