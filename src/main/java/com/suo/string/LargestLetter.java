package com.suo.string;

import java.util.HashSet;

/**
 * 给定字符串S，找到最大的字母字符，其大写和小写字母均出现在S中，则返回此字母的大写，若不存在则返回"NO"。
 * 
 * 输入: S = "admeDCAB"
   输出: "D"

   输入: S = "adme"
   输出: "NO"
 * @author 锁战强
 *
 */
public class LargestLetter {
	
	 public static String solution(String s) {
		char[] arr = s.toCharArray(); 
		HashSet<Character> hashSet = new HashSet<>();
		for(char c : arr) {
			hashSet.add(c);
		}
		Character maxc = '0';
		for(Character c : hashSet) {
			if('a' <= c && c <= 'z') {				
				char up = Character.toUpperCase(c);
				if(hashSet.contains(up)&&up>maxc) {
					maxc = up;
				}
			}
		}
		if(maxc != '0') {
			return maxc.toString();
		}
		return "No";
	 }
	 
	
}
