package com.suo.collection;

import java.util.LinkedList;
import java.util.Properties;

public class MyQueue {
	
	private LinkedList<Integer> list = new LinkedList<>();
	
    /*
     * @param item: An integer
     * @return: nothing
     */
    public void enqueue(int item) {
        list.add(item);
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
    	return list.removeFirst();
    }
    
    public static void test() {
    	
    }
    
    public static void main(String[] args) {
    	Properties p = System.getProperties();
    	int a = 10,b=10;
    	a = a<=b?0:10;
    	p.list(System.out);
    	System.out.println("---内存使用：");
    	Runtime rt = Runtime.getRuntime();
    	System.out.println("总内存："+rt.totalMemory()/1024/1024);
    	System.out.println("剩余内存："+rt.freeMemory()/1024/1024);
    	System.out.println("最大内存："+rt.maxMemory()/1024/1024);
	}
}