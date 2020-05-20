package EASY.RomanToInteger;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution(); 
		int result = solution.romanToInt("IX");
		System.out.println("Result " + result);
		
		

		result = solution.romanToInt("MCMXCIV");
		System.out.println("Result " + result);
		
		
	}

}
