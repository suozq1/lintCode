package com.suo.string;

public class isPalindrome {
    public static boolean meth(int num) {
    	String n = num + "";
    	char[] arr = n.toCharArray();
    	StringBuilder sb = new StringBuilder();
    	for(int i=arr.length-1;i>-1;i--) {
    		sb.append(arr[i]);
    	}
    	if(sb.toString().equals(n)) {
    		return true;
    	}
        return false;
    }
}
