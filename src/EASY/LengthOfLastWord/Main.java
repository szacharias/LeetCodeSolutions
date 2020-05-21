package EASY.LengthOfLastWord;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution(); 
		String input = "Hello World";
		int result = solution.lengthOfLastWord(input);
		System.out.println("Result " + result);

		input = " ";
		result = solution.lengthOfLastWord(input);
		System.out.println("Result " + result);
		
		
	}

}
