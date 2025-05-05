package com.leetcode.medianoftwosortedarrays;

import java.util.*;
public class String_Reverse {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      char[] ch = str.toCharArray();
      rev_string(ch);
      System.out.println(Arrays.toString(ch));
      sc.close();
	}
	static void rev_string(char[] ch) {
		int start = 0; int end = ch.length-1;
		while(start<end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
		    start++;
		    end--;
		}
	}
}
