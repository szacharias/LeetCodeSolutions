package TopInterviewQuestions.EASY.RotateArray;

import java.util.Arrays;

public class RotateArraySolution {

	public static void main(String[] args) {
		int[][] queryList = { { 1, 2, 3, 4, 5, 6, 7 }, { -1, -100, 3, 99 }, { 1, 2 }, { 1 }, { -1 }, { 1, 2, 3 },
				{ 1, 2, 3 }, {1,2,3} };
		int moveSteps[] = { 3, 2, 3, 2, 2, 0, 2 ,4};
		int answer[][] = { { 5, 6, 7, 1, 2, 3, 4 }, { 3, 99, -1, -100 }, { 2, 1 }, { 1 }, { -1 }, { 1, 2, 3 },
				{ 2, 3, 1 }, {3,1,2} };

		for (int i = 7; i < queryList.length; i++) {
			System.out.println("Round " + i);
			rotateCheckAnswer(queryList[i], moveSteps[i], answer[i]);
		}

	}

	// TODO there are atleast 3 solutions

	static public void rotateCheckAnswer(int[] nums, int k, int[] answer) {
		if (nums.length != 1) {
			int[] replaceArray = new int[nums.length];
			int pointer = nums.length;
			for (int i = 0; i < nums.length; i++) {
				if (pointer - k + i >= nums.length) {
					pointer = 0;
				} 
				System.out.println("WRONG");
				System.out.println( pointer -k + i);
				while( pointer -k + i < 0) {
					pointer = pointer + nums.length;
				}
				replaceArray[i] = nums[Math.abs(pointer - k + i)];
				System.out.println(pointer + " " +  k + " " + i  + " " + nums[Math.abs(pointer - k + i)]);
			} 
			for(int i = 0 ; i <nums.length ; i ++) {
				nums[i] = replaceArray[i];
//				if(nums[i] != answer[i])
//					System.out.println("WRONG");
//				System.out.println(nums[i]);
			}
		}else {
			for (int i = 0; i < nums.length; i++) { 
				System.out.println(nums[i]);
			}
		}
	}

//	static public void rotateCheckAnswer(int[] nums, int k , int[] answer) {  
//		boolean correct = true;
////		k = k==0?0:nums.length%2==0?k:nums.length==1?k:k+1;
//		int replaceArray[] = new int[nums.length];
//		for (int i = 0 ; i < nums.length; i++) {
//			if (i + k < nums.length) {
//				System.out.println("q : " + i + " k : " + k + " nums.length " + nums.length);
//				System.out.println(nums[i + k]);
//				replaceArray[i] = nums[i + k];
//			} else { 
//				int base = nums.length;
//				while( (i +  k - base ) >= nums.length) {
//					base = base + nums.length ;
//				}
//				System.out.println("q : " + i + " k : " + k + " base " + base);
//				System.out.println(nums[i + k - base]);
//				replaceArray[i] = nums[i + k - base];
//			} 
//		}
//		for(int i = 0 ; i < replaceArray.length ; i ++) {
//			nums[i] = replaceArray[i]; 
//			if(nums[i] != answer[i]) {
//				correct = false;
//			}
//		} 
//		if(correct == false) {
//			System.out.println("WRONG!");
//			System.out.println(Arrays.toString(nums));
//		}else {
//		System.out.println(Arrays.toString(nums));
//		}
//		System.out.println();
//	}

	static public void rotate(int[] nums, int k) {
		k = k == 0 ? 0 : nums.length % 2 == 0 ? k : nums.length == 1 ? k : k + 1;
		int replaceArray[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i + k < nums.length) {
//				System.out.println("q : " + i + " k : " + k + " nums.length " + nums.length);
//				System.out.println(nums[i + k]);
				replaceArray[i] = nums[i + k];
			} else {
				int base = nums.length;
				while ((i + k - base) >= nums.length) {
					base = base + nums.length;
				}
//				System.out.println("q : " + i + " k : " + k + " base " + base);
//				System.out.println(nums[i + k - base]);
				replaceArray[i] = nums[i + k - base];
			}
		}
		for (int i = 0; i < replaceArray.length; i++) {
			nums[i] = replaceArray[i];
//			System.out.println(nums[i ]);
		}
		System.out.println(Arrays.toString(nums));
	}

}
