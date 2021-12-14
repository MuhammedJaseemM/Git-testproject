package com.ibs.leetcode2;

public class LongestPalindrome {

	public int longestPalindrome(String s) {

		if (s.length() == 0)
			return 0;

		int[] arr = new int[128];

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}

		int even = 0;
		int odd = 0;

		for (int a : arr) {
			even = even + a / 2;
			if (a % 2 == 1)
				odd++;
		}

		int b = odd > 0 ? even * 2 + 1 : even * 2;
		return b;

	}

	public static void main(String[] args) {

		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.longestPalindrome("abccccdd"));

	}

}
