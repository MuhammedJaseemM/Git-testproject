package com.ibs.leetcode2;

import java.util.HashSet;

public class HashsetToArray {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("Australia");
		hs.add("Brazil");
		hs.add("India");
		
		String[] arr =new String[hs.size()];
		hs.toArray(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
