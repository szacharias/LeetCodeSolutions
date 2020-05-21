package EASY.SearchInsertPosition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution();
		int nums[] =  {0,1,2,4};
		int target= 3;
		int result = solution.searchInsert(nums, target);
		System.out.println("Result " + result);
		   
		
	}

}
