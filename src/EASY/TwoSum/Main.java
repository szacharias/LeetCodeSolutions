package EASY.TwoSum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution solution = new Solution();
		int nums[] =  {2, 5,5, 15};
		int target = 10;
		int answer[] = solution.twoSum2(nums, target);
		System.out.println("Answer " + answer[0] + ", " + answer[1]);
		
		int nums2[] = {3,2,4};
		target = 6;
//		int answer[] = solution.twoSum2(nums2, target);
//		System.out.println("Answer " + answer[0] + ", " + answer[1]);
		
//		System.out.println(nums2.length / 2);
		
	}

}
