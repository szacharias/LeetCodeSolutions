package EASY.SearchInsertPosition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import sun.security.util.ArrayUtil;

public class Solution {
	
	// Find location of the target, if exist return cur location
	public int searchInsert(int[] nums, int target) {
		int low = 0 ;
		int high = nums.length-1; 
		while( low <= high) {
			int findLocation = (low  + high ) /2;
			System.out.println("low " + low);
			System.out.println("high " + high);
			System.out.println("findLocation " + findLocation);
			if (nums[findLocation] == target) {
				return findLocation;
			}else if (nums[findLocation] > target) {
				high =findLocation-1;
			}else if (nums[findLocation ] < target) {
				low = findLocation+1;
			} 
		}
		
		return low;
	}
}
