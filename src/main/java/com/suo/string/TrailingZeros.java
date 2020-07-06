package com.suo.string;

public class TrailingZeros {
	
	public static long trailingZeros(long n) {
		long num = 0;
	    while(n > 0) {
	    	num += n / 5;
	        n /= 5;
	    }
	    return num;
	}
	
	public static void main(String[] args) {
		System.out.println(trailingZeros(30));
	}
}
