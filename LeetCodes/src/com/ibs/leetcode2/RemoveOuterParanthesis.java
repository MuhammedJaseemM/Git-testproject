package com.ibs.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class RemoveOuterParanthesis {

	public String removeOuterParentheses(String s) {
		char[] arr = s.toCharArray();
		int a = 0;

		List<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(')
				a++;
			else if (arr[i] == ')')
				a--;

			if (index.size() % 2 == 0 && a == 1) {
				index.add(i + 1);
			} else if (index.size() % 2 != 0 && a == 0) {
				index.add(i);
			}
		}
		String res = "";
		for (int i = 0; i < index.size(); i += 2) {
			res = res + s.substring(index.get(i), index.get(i + 1));
		}

		return res;
	}

	public static void main(String[] args) {

		RemoveOuterParanthesis rop = new RemoveOuterParanthesis();
		String s = "(()())(())";
		System.out.println(rop.removeOuterParentheses(s));
	}

}
