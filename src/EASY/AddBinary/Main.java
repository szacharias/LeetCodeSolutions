package EASY.AddBinary;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution(); 
		String a = "11";
		String b = "1";
		String result = solution.addBinary(a,b);
		System.out.println("Result " + result);
 
		

		a = "1010";
		b = "1011";
		result = solution.addBinary(a,b);
		System.out.println("Result " + result);
		

		a = "0";
		b = "0";
		result = solution.addBinary(a,b);
		System.out.println("Result " + result);
	}

}
