package EASY.LongestCommonPrefix;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {

	public String longestCommonPrefix(String[] strs) {
		boolean stillSame = true;

		String roundIndex = "";
		int minLength = findMinimum(strs);
		if (minLength == 0) {
			return "";}
		int letterIndex = 0;

		while (stillSame) {

			for (int i = 0; i < strs.length - 1; i++) {
				if (strs[i].toCharArray()[letterIndex] != strs[i + 1].toCharArray()[letterIndex]) {
					stillSame = false;
				}
			}

			if (stillSame) {
				roundIndex = roundIndex + strs[0].toCharArray()[letterIndex]; 
			}
			letterIndex += 1;
			if (minLength <= letterIndex) {
				stillSame = false;
			}
		}

		return roundIndex;
	}

	private int findMinimum(String[] strs) {
		try {
			int minLength = strs[0].length();
			for (int i = 1; i < strs.length; i++) {
				if (strs[i].length() < minLength) {
					minLength = strs[i].length();
				}
			}

			return minLength;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}
}
