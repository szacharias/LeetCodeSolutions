package EASY.LongestCommonPrefix;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution(); 
		String input[] = {"flower","flow","flight"};
		String result = solution.longestCommonPrefix(input);
		System.out.println("Result " + result);
		
		 
		String input1[] = {"c","c"};
		result = solution.longestCommonPrefix(input1);
		System.out.println("Result " + result);
		
		
		String input2[] = {};
		result = solution.longestCommonPrefix(input2);
		System.out.println("Result " + result);
		
		
	}

}
