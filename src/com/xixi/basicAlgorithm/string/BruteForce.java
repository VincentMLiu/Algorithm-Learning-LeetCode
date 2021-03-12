package com.xixi.basicAlgorithm.string;

public class BruteForce {


    public static int bruteForce(String str, String pattern) {
        int resultIndex= -1;

        //校验
        if(str == null || pattern == null) return resultIndex;
        if(str.isEmpty()|| pattern.isEmpty()) return resultIndex;

        char[] strChars = str.toCharArray();
        char[] patternChars = pattern.toCharArray();

        int strCharsLen = strChars.length;
        int patternCharsLen = patternChars.length;

        int start = 0;

        while(start <= (strCharsLen-patternCharsLen)){
            int i = 0;
            while(i < patternCharsLen){
                if(strChars[start + i] != patternChars[i]){
                    break;
                }
                i++;
            }
            if(i == patternCharsLen){
                return start;
            }

            start++;
        }




        return resultIndex;
    }


    public static void main(String[] args) {
        String str = "ATGTGAGCTGGTGTGTGCFAA";
        String pattern = "GCFAA";
        int index = bruteForce(str, pattern);
        System.out.println("首次出现位置：" + index);
        str.hashCode();
    }


}
