package com.ibs.leetcode2;

public class StringReversal {

	public static void main(String[] args) {

		String str = "IBS Cochin";

		StringBuilder sb = new StringBuilder();
		char[] strChars = str.toCharArray();

		for (int i = strChars.length - 1; i >= 0; i--) {
			sb.append(strChars[i]);
		}

		System.out.println(sb);
	}

}
