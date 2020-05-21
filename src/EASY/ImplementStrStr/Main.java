package EASY.ImplementStrStr;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution();
		String haystack = "hello";
		String needle = "ll";
		int result = solution.strStr1(haystack, needle);
		System.out.println("Result " + result);
		  
		haystack = "aaaaaaaa";
		needle = "bba";
		result = solution.strStr1(haystack, needle);
		System.out.println("Result " + result);
		
		haystack = "mississippi";
		needle   = "issipi";
		result = solution.strStr1(haystack, needle);
		System.out.println("Result " + result);
		
		
	}

}
