package TopInterviewQuestions.EASY.RemoveDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArraySolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int example1[] = { 1, 1, 2 };
		// should return 2
		int example2[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		// should return 5
		int example3[] = { 1, 2 }; 
		// should return 2
		
		
		long startTime = System.nanoTime();
		System.out.println("Example 2 output is : " + removeDuplicates(example2));
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		System.out.println("Example 2 output is : " + removeDuplicatesSuper(example2));
		endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
	}

	// === Without SET interface, slow but relatively memory efficient ===
	public static int removeDuplicates(int[] nums) {

		int uniqueNumberCount = 1;
		int newArrayCurrentIndex = 1;
		for (int q = 1; q < nums.length; q++) {
			boolean foundNumber = false;
			for (int w = 0; w < q; w++)
				if (nums[q] == nums[w])
					foundNumber = true;

			if (!foundNumber) {
				uniqueNumberCount++;
				nums[newArrayCurrentIndex++] = nums[q];
			}
		}
		return uniqueNumberCount;
	}
	// === Without SET interface, slow but relatively memory efficient END ===

	// --- fastest and most memory efficient solution from github --- 
	public static int removeDuplicatesSuper(int[] nums) {
		int i = 0;
		for (int n : nums)
			if (i == 0 || n > nums[i - 1])
				nums[i++] = n;
		return i;
	}
	// --- fastest and most memory efficient solution from github END--- 

	// === try with set ===
	public static int removeDuplicatesWithSet(int[] nums) {
		Set<Integer> theSet = initSet(nums);
		return theSet.size();
	}

	public static Set<Integer> initSet(int[] nums) {
		Set<Integer> theSet = new HashSet<>();
		for (int index = 0; index < nums.length; index++) {

			theSet.add(nums[index]);
		}
		for (Integer i : theSet) {
			nums[i] = i;
		}

		for (int i : nums) {
			System.out.println(i);
		}
		return theSet;
	}
	// === try with set end ===

	// --- Passed Solution with Set End ---
	public int removeDuplicatesSetPassed(int[] nums) {

		Set<Integer> theSet = new HashSet<>();
		int i = 0;
		for (int index = 0; index < nums.length; index++) {

			theSet.add(nums[index]);
		}
		for (Integer number : theSet) {
			nums[i++] = number;
		}

		return theSet.size();
	}
	// --- Passed Solution with Set End ---

}
