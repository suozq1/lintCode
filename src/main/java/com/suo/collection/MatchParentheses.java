package com.suo.collection;

import java.util.LinkedList;

public class MatchParentheses {
	public static boolean match(String string) {
		LinkedList<Character> stack = new LinkedList<>();
		char[] arr = string.toCharArray();
		Character left = '(';
		for(Character c : arr) {
			if(c.equals(')')) {			
				if(left.equals(stack.peekLast())) {
					stack.removeLast();
				}else {
					return false;
				}
			}else {
				stack.add(c);
			}
		}
		return stack.isEmpty();
	}
}
