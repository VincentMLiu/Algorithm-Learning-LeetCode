package com.xixi.easy.id0001;

import java.util.HashMap;
import java.util.Map;

public class Solotion {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
           for(int i=0; i<nums.length; i++){
               int comp = target - nums[i];
               if(map.containsKey(new Integer(comp))){
                   return new int[]{map.get(new Integer(comp)), i};
               }
               map.put(nums[i], i);
           }
          throw new IllegalArgumentException("No two sum solution"); 
       }
}
