package EASY.PlusOne;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution(); 
		int input[] = {1,2,3};
		int []result = solution.plusOne(input);
		System.out.println("Result " + result);

		int input2[] = {4,3,2,1};
		result = solution.plusOne(input2);
		System.out.println("Result " + result);
		

		int input3[] = {8, 9,9,9};
		result = solution.plusOne(input3);
		for(int i = 0 ; i < result.length; i ++) {
			System.out.println(result[i]);
		}
		System.out.println();
		int input4[] = {9};
		result = solution.plusOne(input4);
		for(int i = 0 ; i < result.length; i ++) {
			System.out.println(result[i]);
		}
	}

}
