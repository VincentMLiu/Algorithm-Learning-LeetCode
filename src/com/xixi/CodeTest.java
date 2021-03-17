package com.xixi;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeTest {


    public static void main(String[] args) {


        int[] nums = {1,2,3,4,5};

        System.out.println(left_bound(nums,4));
    }


    public static String generateAnUniqueID(){
        Random rd = new Random();
        String currentTimeMillis = "" + System.currentTimeMillis();

        String random6Int = String.format("%06d",Integer.valueOf(rd.nextInt(1000000)));

        String ID = currentTimeMillis + "_" + random6Int;

        return ID;
    }


    public static int left_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length; // 注意

        while (left < right) { // 注意
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid; // 注意
            }
        }
        return left;
    }

}
