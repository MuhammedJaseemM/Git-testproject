package com.ibs.leetcode2;

import java.util.Arrays;

public class ArrayMerge {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = m, j = 0; i < nums1.length; i++, j++) {
			nums1[i] = nums2[j];

		}
		Arrays.sort(nums1);

		for (int i = 0; i < nums1.length; i++)
			System.out.println(nums1[i]);
	}

	public static void main(String[] args) {

		ArrayMerge am = new ArrayMerge();

		int[] num1 = { 1, 2, 3, 0, 0, 0 };
		int[] num2 = { 2, 5, 6 };
		int m = 3, n = 3;
		am.merge(num1, m, num2, n);
	}

}
