package EASY.LengthOfLastWord;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
	public int lengthOfLastWord(String s) {
		String[] split = s.split(" ");

		if (split.length > 0) {
			return split[split.length - 1].length();
		}else {
			return 0;
		}
//		return 0;
	}
}
