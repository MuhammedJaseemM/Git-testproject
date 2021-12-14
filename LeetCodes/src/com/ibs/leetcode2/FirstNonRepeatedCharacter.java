package com.ibs.leetcode2;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String string = "IBS India";

		for (char i : string.toCharArray()) {
			if (string.indexOf(i) == string.lastIndexOf(i)) {
				System.out.println(i);
				break;
			}
		}

	}
}
