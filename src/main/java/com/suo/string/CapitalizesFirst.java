package com.suo.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 首字母大写
 * @author 锁战强
 *
 */
public class CapitalizesFirst {
	public static String capitalizesFirst(String s) {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("(\\w)(\\w* *)");
        Matcher matter = pattern.matcher(s);
        while (matter.find()) {
			sb.append(matter.group(1).toUpperCase());
			sb.append(matter.group(2));
		}
        return sb.toString();
    }
	public static void main(String[] args) {
		String s = "i jidls    mdijf  i  lsidj  i p l   ";
		String expectResult ="I Jidls    Mdijf  I  Lsidj  I P L   ";
		System.out.println(capitalizesFirst(s));
	}
}
