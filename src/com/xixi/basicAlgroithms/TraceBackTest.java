package com.xixi.basicAlgroithms;

import java.util.HashMap;

public class TraceBackTest {

    public static int maxW = Integer.MIN_VALUE; //存储背包中物品总重量的最大值
    // cw表示当前已经装进去的物品的重量和；i表示考察到哪个物品了；
// w背包重量；items表示每个物品的重量；n表示物品个数
// 假设背包可承受重量100，物品个数10，物品重量存储在数组a中，那可以这样调用函数：
// f(0, 0, a, 10, 100)

    public static HashMap<Integer, Boolean> mapPut = new HashMap<>();

    public static void f(int i, int cw, int[] items, int n, int w) {
        if (cw == w || i == n) { // cw==w表示装满了;i==n表示已经考察完所有的物品
            if (cw > maxW) maxW = cw;
            System.out.println(mapPut);
            return;
        }

        mapPut.put(i+1,false);
        f(i+1, cw, items, n, w);
        if (cw + items[i] <= w) {// 已经超过可以背包承受的重量的时候，就不要再装了
            mapPut.put(i+1,true);
            f(i+1,cw + items[i], items, n, w);
        }
    }
    public static void main(String[] args) {


        int[] items = {15,18,19,2,7,9,3,6,10,8};
        for(int i = 0; i < items.length; i++){
            mapPut.put(i,false);
        }
        f(0,0,items,items.length,50);


    }



    public class Pattern {
        private boolean matched = false;
        private char[] pattern; // 正则表达式
        private int plen; // 正则表达式长度

        public Pattern(char[] pattern, int plen) {
            this.pattern = pattern;
            this.plen = plen;
        }

        public boolean match(char[] text, int tlen) { // 文本串及长度
            matched = false;
            rmatch(0, 0, text, tlen);
            return matched;
        }

        private void rmatch(int ti, int pj, char[] text, int tlen) {
            if (matched) return; // 如果已经匹配了，就不要继续递归了
            if (pj == plen) { // 正则表达式到结尾了
                if (ti == tlen) matched = true; // 文本串也到结尾了
                return;
            }
            if (pattern[pj] == '*') { // *匹配任意个字符
                for (int k = 0; k <= tlen-ti; ++k) {
                    rmatch(ti+k, pj+1, text, tlen);
                }
            } else if (pattern[pj] == '?') { // ?匹配0个或者1个字符
                rmatch(ti, pj+1, text, tlen);
                rmatch(ti+1, pj+1, text, tlen);
            } else if (ti < tlen && pattern[pj] == text[ti]) { // 纯字符匹配才行
                rmatch(ti+1, pj+1, text, tlen);
            }
        }
    }


}
