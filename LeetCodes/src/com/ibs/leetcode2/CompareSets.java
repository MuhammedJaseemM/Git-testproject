package com.ibs.leetcode2;

import java.util.HashSet;

public class CompareSets {

	public static void main(String[] args) {

		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("India");
		hs1.add("Australia");
		hs1.add("Brazil");
		hs1.add("Germany");
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Spain");
		hs2.add("England");
		hs2.add("South Africa");
		hs2.add("Brazil");
		
		hs1.retainAll(hs2);
		System.out.println(hs1);
		
		
	}

}
