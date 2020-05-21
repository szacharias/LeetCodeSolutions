package EASY.PlusOne;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {

	public int[] plusOne(int[] digits) {
		digits[digits.length - 1] = digits[digits.length - 1] + 1; 
		if (digits[digits.length - 1] > 9) {
			digits[digits.length - 1] = 0;
			for ( int i = digits.length -2; i >= 0 ; i --) {
				digits[i] = digits[i] +1;
				if (digits[i]  <= 9 ) {
					return digits;
				}else {
					digits[i] = 0;
				}
			} 
			
			
			int newDigits[] = new int[digits.length+1];
			newDigits[0] = 1;
			return newDigits; 
			
		} else {

			return digits;
		}
		 
	}

}
