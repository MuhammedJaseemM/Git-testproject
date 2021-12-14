package com.ibs.leetcode2;

public class PalindromicSubstrings {

	public int countSubstrings(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {

			res += count(s, i, i);
			res += count(s, i, i + 1);
		}

		return res;

	}

	private int count(String s, int start, int end) {
		int res = 0;
		while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			res++;
			start--;
			end++;
		}
		return res;
	}

	public static void main(String[] args) {
		PalindromicSubstrings ps = new PalindromicSubstrings();
		System.out.println(ps.countSubstrings("abcba"));
	}

}
