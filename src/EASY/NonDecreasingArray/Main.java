package EASY.NonDecreasingArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,2,3};
		boolean expectedSolution = false;
		
//		int[] nums = {4,2,3};
//		boolean expectedSolution = true;
		
//		int[] nums = {-1, 4,2,3};
//		boolean expectedSolution = true;
		
		Solution solution = new Solution();
		System.out.println(solution.checkPossibility(nums));
		boolean returnedAnswer = solution.checkPossibility(nums);
		
		if( returnedAnswer != expectedSolution) {
			System.out.println("The Answer is Incorrect");
		}else {
			System.out.println("The Answer is Correct");
		}
		
		
	}

}
