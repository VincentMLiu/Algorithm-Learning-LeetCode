package com.xixi.medium.id0622;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        // 1. Initialize a queue.
//        Queue<Integer> q = new LinkedList();
//        // 2. Get the first element - return null if queue is empty.
//        System.out.println("The first element is: " + q.peek());
//        // 3. Push new element.
//        q.offer(5);
//        q.offer(13);
//        q.offer(8);
//        q.offer(6);
//        // 4. Pop an element.
//        q.poll();
//        // 5. Get the first element.
//        System.out.println("The first element is: " + q.peek());
//        // 7. Get the size of the queue.
//        System.out.println("The size is: " + q.size());
		
		
		int  i = 9;
		System.out.println(i /=10);
	}

	
    public boolean isPalindrome(int x) {
    		if(x<0)  return false;
    		if(x >=0 && x<10)  return true;
            int rev = 0;
            int pro = x;
            while(pro > 0){
                rev = rev*10 + pro%10;
                pro /=10;
            }
            if(rev == x){
                return true;
            }else {
                return false;
            }
          
            
    }
}
