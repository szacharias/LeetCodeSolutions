package EASY.ReverseInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Solution : " + Math.pow(2, -31));
		
		Solution solution = new Solution(); 
		int input = -123; 
		System.out.println("Solution : " + solution.reverse(input) );
		

		input = 1534236469; 
		System.out.println("Solution : " + solution.reverse(input) );
	}

}
