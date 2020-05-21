package EASY.ImplementStrStr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

import sun.security.util.ArrayUtil;

public class Solution {

	// find first appearance of substring
	public int strStr(String haystack, String needle) {

		return haystack.indexOf(needle, 0);

	}

	public int strStr1(String haystack, String needle) {
		if (needle.length() == 0)
			return 0;

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				boolean stillCorrect = true;
				for (int j = 1; j < needle.length(); j++) {
					try {
						if (needle.charAt(j) != haystack.charAt(i + j)) {
							stillCorrect = false;
						}
					} catch (Exception e) {
						return -1;
					}

				}
				if (stillCorrect == true) {
					return i;
				}
			}
		}

		return -1;
	}
}
