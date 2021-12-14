package com.ibs.leetcode2;

import java.util.Arrays;

public class TaskScheduler {

	public int leastInterval(char[] tasks, int n) {
		int[] num = new int[26];

		for (char c : tasks) {
			num[c - 'A']++;
		}
		Arrays.sort(num);
		int time = 0;

		while (num[25] > 0) {
			int i = 0;
			while (i <= n) {
				if (num[25] == 0)
					break;
				if (i < 26 && num[25 - i] > 0)
					num[25 - i]--;
				time++;
				i++;
			}
			Arrays.sort(num);
		}
		return time;
	}

	public static void main(String[] args) {

		TaskScheduler tk = new TaskScheduler();
		char[] arr = { 'A', 'A', 'A', 'B', 'B', 'B' };
		int a = tk.leastInterval(arr, 2);
		System.out.println("Unit time : " + a);
	}

}
