package com.xixi;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeTest {


    public static void main(String[] args) {

        String pattern = "cabcab";


        char[] b = pattern.toCharArray();
        int m = b.length;
        int[] suffix = new int[m];
        boolean[] prefix = new boolean[m];

        generateGS(b,m,suffix,prefix);

    }



    // b表示模式串，m表示长度，suffix，prefix数组事先申请好了
    private static void generateGS(char[] b, int m, int[] suffix, boolean[] prefix) {
        for (int i = 0; i < m; ++i) { // 初始化
            suffix[i] = -1;
            prefix[i] = false;
        }
        for (int i = 0; i < m - 1; ++i) { // b[0, i]
            int j = i;
            int k = 0; // 公共后缀子串长度
            while (j >= 0 && b[j] == b[m-1-k]) { // 与b[0, m-1]求公共后缀子串
                --j;
                ++k;
                suffix[k] = j+1; //j+1表示公共后缀子串在b[0, i]中的起始下标
            }
            if (j == -1) prefix[k] = true; //如果公共后缀子串也是模式串的前缀子串
        }
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
