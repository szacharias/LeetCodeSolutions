package HARD.TrappingRainWater;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Solution solution = new Solution(); 
		int input[] = {0,1,0,2,1,0,1,3,2,1,2,1};  
		System.out.println("Solution : " + solution.trap(input) );
		
		int input1[] = {0,7,1,4,6};  
		System.out.println("Solution : " + solution.trap(input1) );
		
		int input3[] = {2,0,2};  
		System.out.println("Solution : " + solution.trap(input3) );

		int input2[] = {4,2,3};  
		System.out.println("Solution : " + solution.trap(input2) );
		
	}

}
