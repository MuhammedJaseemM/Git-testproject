package com.ibs.leetcode2;

public class ReversingWords {

	public static void main(String[] args) {
		String s = "IBS COCHIN AND TRIVANDRUM";
		String w[] = s.split(" ");
		String s2 = "";
		for (int k = 0; k < w.length; k++) {
			for (int i = w[k].length() - 1; i >= 0; i--) {
				s2 = s2 + w[k].charAt(i);
			}
			s2 = s2 + " ";

		}

		System.out.print(s2);
	}

}
