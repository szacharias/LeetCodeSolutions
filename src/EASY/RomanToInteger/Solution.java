package EASY.RomanToInteger;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {

	// Try solving it without converting it into an String
	public int romanToInt(String s) {
		Map<String, Integer> mapping = mappingValues();
		char sArr[] = s.toCharArray();
		int total = 0;
		int i = sArr.length;
		while (i > 0) {
			i = i - 1; 
			int num1 = mapping.get(sArr[i] + "");
			if (i - 1 >= 0) {
				int num2 = mapping.get(sArr[i - 1] + "");

				if (num1 <= num2) {
					total += num1;
				}else {
					total += Math.abs(num2 - num1);
					i -= 1;
				}
			} else {
				total += num1;
			}
		}

		return total;
	} 
	private Map<String, Integer> mappingValues() {
		Map<String, Integer> mapping = new HashMap<String, Integer>();
		mapping.put("I", 1);
		mapping.put("V", 5);
		mapping.put("X", 10);
		mapping.put("L", 50);
		mapping.put("C", 100);
		mapping.put("D", 500);
		mapping.put("M", 1000);

		return mapping;
	}
}
