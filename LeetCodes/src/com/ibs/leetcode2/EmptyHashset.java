package com.ibs.leetcode2;

import java.util.HashSet;

public class EmptyHashset {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("Australia");
		hs.add("Brazil");
		hs.add("India");
		
		hs.clear();
		System.out.println(hs);
	}

}
