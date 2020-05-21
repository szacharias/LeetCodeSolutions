package EASY.ValidParentheses;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution(); 
		String input ="()" ;
		boolean result = solution.isValid(input);
		System.out.println("Result " + result);
		 

		input  = "()[]{}";
		result = solution.isValid(input);
		System.out.println("Result " + result);
		

		input  =  "(]";
		result = solution.isValid(input);
		System.out.println("Result " + result);
		

		input  = "([)]";
		result = solution.isValid(input);
		System.out.println("Result " + result);
		
	}

}
