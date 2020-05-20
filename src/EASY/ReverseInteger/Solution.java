package EASY.ReverseInteger;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Solution {

	public int reverse(int x) {
		if (x < -Math.pow(2, 31)  || x > Math.pow(2, 31) -1) return 0;
		
		char[] charArray = String.valueOf(x).toCharArray(); 
//		System.out.println(charArray);
		boolean isNegative = false;
		long returnNumber = 0;
		int powerIndex = 0;
		for (int i = 0; i < charArray.length; i++) {
			powerIndex = i;
			if (charArray[i] == '-' && i == 0) {
				// is negative;
				isNegative = true;

			} else {
				if (isNegative) {

//					System.out.println((charArray[i] - '0'));
					returnNumber += (charArray[i] - '0') * Math.pow(10, powerIndex -1);
				} else {
//					System.out.println((charArray[i] - '0'));
					returnNumber += (charArray[i] - '0') * Math.pow(10, powerIndex);
				}

			}
//			System.out.println(returnNumber);
		}

		if (isNegative == true) {
			returnNumber = returnNumber * -1;
		}

		if (returnNumber < -Math.pow(2, 31)  || returnNumber > Math.pow(2, 31) -1) return 0;
		
		int returnInt = (int) returnNumber;
		return returnInt;
	}
}