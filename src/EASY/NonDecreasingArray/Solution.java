package EASY.NonDecreasingArray;

import java.util.Arrays;

class Solution {
	public boolean checkPossibility(int[] nums) {
		int total_error = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			boolean flag = false;
			if (nums[i] > nums[i + 1]) {
//				System.out.println(i + " " + (i+1));
				total_error += 1;
				flag = true;
			}
//			System.out.println(i);
			if (i < nums.length - 2 && flag == true) {
				if (nums[i ] > nums[i + 2]) {
					System.out.println((i+1) + " " + (i+2));
					total_error += 1;
				}
			}
		}
		System.out.print(total_error);
		if (total_error > 1) {
			return false;
		} else {
			return true;
		}

	}

}