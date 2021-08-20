package com.xixi.easy.id0009;

public class Solotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		if (x >= 0 && x < 10)
			return true;
		int rev = 0;
		int pro = x;
		//将数据倒置，如果等于原来的数x就是回文，不等于就不是
		while (pro > 0) {
			rev = rev * 10 + pro % 10;
			pro /= 10;
		}
		if (rev == x) {
			return true;
		} else {
			return false;
		}
	}
}
