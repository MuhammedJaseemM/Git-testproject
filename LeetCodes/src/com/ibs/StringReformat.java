package com.ibs;

import java.util.ArrayList;
import java.util.List;

public class StringReformat {

	public String reformat(String s) {

		List<Character> characters = new ArrayList<Character>();
		List<Character> digits = new ArrayList<Character>();

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				digits.add(c);
			} 
			else {
				characters.add(c);
			}
		}

		if (Math.abs(characters.size() - digits.size()) >= 2) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		boolean n = (digits.size() >= characters.size() ? true : false);

		for (int i = 0; i < s.length(); i++) {
			if (n) {
				sb.append(digits.remove(0));
			} else {
				sb.append(characters.remove(0));
			}
			n = !n;
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		StringReformat string = new StringReformat();
		System.out.println(string.reformat("covid2019"));
	}

}
