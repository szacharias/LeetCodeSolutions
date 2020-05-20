package Codility_OA_Harvey_2;

public class Main {
	public static void main(String[] args) {
		Solution t = new Solution();
		System.out.println(t.solution(2, "1A 2F 1C"));
		System.out.println(t.solution(1, ""));
		int N;
		String S;
//		System.out.printf("N(%s), S(%s) => %s", N = 30, S = t.genBookedSeats(N), t.solution(N, S));
		

		int test1 = 40;
		String test2 = "1A 3C 2B 40G 5A";
		System.out.println("Test6 :"  + t.solution(test1, test2) + "\n");
		
		test1 = 1;
		test2 = "";
		System.out.println("Test2 :"  + t.solution(test1, test2) + "\n"); 
		//Solution = 2
		 
		test1 = 2;
		test2 = "";
		System.out.println("Test3 :"  + t.solution(2, "1A 2F 1C") + "\n"); 
		//Solution = 4

//		test1 = 50;
//		test2 = "1A 1K 1B 1C 1D 1E";
//		System.out.println("Test4 :"  + t.solution(test1, test2) + "\n"); 
//		//Solution = 1
		
//
//		test1 = 0;
//		test2 = "1A 1K 1B 1C 1D 1E";
//		System.out.println("Test5 :"  + t.solution(test1, test2) + "\n"); 
//		//Solution = 1
		

		test1 = 10;
		test2 = "1A 1K 1B 1C 10B 10F 1E";
		System.out.println("Test4 :"  + t.solution(test1, test2) + "\n"); 
	}
}
