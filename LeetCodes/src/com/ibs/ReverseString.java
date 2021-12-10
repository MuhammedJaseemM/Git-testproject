package com.ibs;

public class ReverseString {

	public String reverseString(char[] s) {

		int n = s.length;
		for (int i = 0; i < n / 2; i++) {
			s[i] = (char) (s[i] + s[n - 1 - i]);
			s[n - 1 - i] = (char) (s[i] - s[n - 1 - i]);
			s[i] = (char) (s[i] - s[n - 1 - i]);
		}

		return new String(s);
	}

	public static void main(String[] args) {

		ReverseString string = new ReverseString();
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(string.reverseString(s));
	}

}
