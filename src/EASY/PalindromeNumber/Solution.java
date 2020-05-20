package EASY.PalindromeNumber;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Solution {

	// Try solving it without converting it into an String
	public boolean isPalindrome(int x) {
		BigInteger x_ = new BigInteger("" + x);
		BigInteger palindrome = new BigInteger(""+ 0);
		int tempX = x;
		boolean isNegative = x_.compareTo(BigInteger.valueOf(0)) == -1 ? true : false;
		if (isNegative)
			return false;
		ArrayList<Integer> savedDigits = new ArrayList<Integer>(); 
		while (x_.divide(BigInteger.valueOf(10)).compareTo(BigInteger.valueOf(0))  == 1) {
			int singleDigit = x_.remainder(BigInteger.valueOf(10)).intValue();
			savedDigits.add(singleDigit);
			x_ = x_.divide(BigInteger.valueOf(10)); 
		}
		
		int singleDigit = x_.remainder(BigInteger.valueOf(10)).intValue();
		savedDigits.add(singleDigit);  
		
		for (int i = 0; i < savedDigits.size() ; i++) {
			int curDigit = savedDigits.get(i);
			int power = savedDigits.size() - 1 - i; 
			palindrome = palindrome.add( BigInteger.valueOf( (long)(curDigit * Math.pow(10, power)))); 
		}  
		
		if (palindrome.compareTo(BigInteger.valueOf(x)) == 0)
			return true;
		return false;
	}
}
