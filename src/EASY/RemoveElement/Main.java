package EASY.RemoveElement;

public class Main {

	public static void main(String[] args) {

		
		Solution solution = new Solution(); 
		int val = 3 ;
		int arr[] = {3,2,2,3};
		int result = solution.removeElement(arr, val);
		System.out.println("Result " + result);
		 
		
		val = 2 ;
		int arr2[] = {0,1,2,2,3,0,4,2};
		result = solution.removeElement(arr2, val);
		System.out.println("Result " + result);
		

		val = 0 ;
		int arr3[] = {0};
		result = solution.removeElement(arr3, val);
		System.out.println("Result " + result);  
		
	}

}
