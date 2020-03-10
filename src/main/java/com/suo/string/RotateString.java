package com.suo.string;

public class RotateString {

	public static void rotateString(char[] str, int offset) {
		// write your code here
		if (str.length > 0) {
			int position = str.length - offset % str.length;
			if (position > 0) {
				char[] temp = new char[position];
				for (int i = 0; i < position; i++) {
					temp[i] = str[i];
				}
				for (int i = 0; i < str.length - position; i++) {
					str[i] = str[i + position];
				}
				for (int i = str.length - position, j = 0; i < str.length; i++, j++) {
					str[i] = temp[j];
				}

			}
		}
	}

	public static void main(String[] args) {
		char[] str = {'a','b','c','d','e','f','g'};
		int offset = 10;
		rotateString(str,offset);
		System.out.println(new String(str));
	}
}
