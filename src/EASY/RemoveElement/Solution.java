package EASY.RemoveElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

import sun.security.util.ArrayUtil;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int index = 0;
		int falseIndex = 0;
		while (index < nums.length ) {
			if (nums[index] != val) { 
				nums[falseIndex] = nums[index];
				falseIndex +=1;
			}
			index += 1;

		}

		return falseIndex ;
	}

}
