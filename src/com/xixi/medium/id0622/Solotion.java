package com.xixi.medium.id0622;

public class Solotion {

    private Integer[] circularQueue;
    private int p_head = -1;
    private int p_tail = -1;
    private int queue_size = 0;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public Solotion(int k) {
        circularQueue = new Integer[k];
        queue_size = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            System.out.println("Queue is Full");
           return false;
        }else if(isEmpty()) {
            p_head++;
            p_tail++;
        	circularQueue[p_tail] = value;
        }else {
        	p_tail = (p_tail + 1) % queue_size;
        	circularQueue[p_tail] = value;
        }
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
           return false;
        }else if(p_head == p_tail && p_head!=-1){//head pin and tail pin are same, so here is only one element exist.
        	circularQueue[p_head] = null;
        	p_head=-1;
        	p_tail=-1;
        	return true;
        }else {
        	circularQueue[p_head] = null; //remove head element
            p_head = (p_head + 1) % queue_size;
        }
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty()){
        	return circularQueue[p_head];
        }else{
            return -1;
        }
            
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(!isEmpty()){
        	return circularQueue[p_tail];
        }else{
            return -1;
        }
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(p_tail == p_head && p_head ==-1){
            return true;
        }else {
            return false;
        }
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
       int check= (p_head - p_tail + queue_size) % queue_size;
        
        if(check==1){
            return true;
        }else {
            return false;
        }
        
    }
}

/**
 * Your Solotion object will be instantiated and called as such:
 * Solotion obj = new Solotion(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
