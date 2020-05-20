package EASY.TwoSum;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Solution {
	
    public int[] twoSum(int[] nums, int target) {
    	
    	
    	int returnList[] = new int[2]; 
    	for (int i = 0 ; i < nums.length ; i ++) {

    		for(int j = i + 1 ; j < nums.length ; j ++) { 
    			if (nums[j] + nums[i] == target) {
    				returnList[0] = i; 
    				returnList[1] = j ;
    				return returnList;
    			}
    		}
    		
    		
    	}
    	
    	return returnList;
    }
    
    // This is still slower
    public int[] twoSum2(int[] nums, int target) {
    	
    	int temp[] = nums.clone();
    	Arrays.sort(nums);
    	int returnList[] = new int[2];
    	boolean solution = false;
		int indexSmall = 0;
		int indexLarge = nums.length -1;
		int solution1 = 0;
		int solution2 = 0;
		
    	while(!solution ) {
    		System.out.println("indexSmall" +indexSmall);
    		System.out.println("indexLarge" + indexLarge);
    		if (nums[indexSmall] + nums[indexLarge] == target) {
    			solution1 = nums[indexSmall];
    			solution2 = nums[indexLarge];
//    			return returnList;
    			solution = true;
    		}else if (nums[indexSmall] + nums[indexLarge] > target) {
    			indexLarge -= 1;
    		}else if (nums[indexSmall] + nums[indexLarge] < target) {
    			indexSmall += 1;
    		}
    		
    	}
    	
 
    	for (int i = 0 ; i < temp.length; i ++) {
    		System.out.println(temp[i]);
    		if (temp[i] == solution1 && returnList[0] == 0 ) { 
    			returnList[0] = i;
    		}else if  (temp[i] == solution2  ) { 
    			returnList[1] = i;
    		} 
    	} 
    	
    	return returnList;
    }
}