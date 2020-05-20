package EASY.PalindromeNumber;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution(); 
		boolean result = solution.isPalindrome(123);
		System.out.println("Solution : " + result );
 
		
		result = solution.isPalindrome(121);
		System.out.println("Solution : " + result );


		result = solution.isPalindrome(1001);
		System.out.println("Solution : " + result );

		
		result = solution.isPalindrome(-121);
		System.out.println("Solution : " + result + "\n" );
		
		

		result = solution.isPalindrome(10);
		System.out.println("Solution : " + result );
	}

}
