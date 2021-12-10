package com.ibs;

public class RemoveAllAdjacentDuplicates {

	public String removeDuplicates(String s) {

		if (s.length() <= 1)
			return s;

		int index = 0;
		char[] a = new char[s.length()];

		for (char c : s.toCharArray()) {
			if (index != 0 && a[index - 1] == c) {
				index--;
			}
			else {
				a[index++] = c;
			}
		}

		return new String(a).substring(0, index);

	}

	public static void main(String[] args) {
		RemoveAllAdjacentDuplicates string = new RemoveAllAdjacentDuplicates();
		System.out.println(string.removeDuplicates("abbaca"));
	}

}
