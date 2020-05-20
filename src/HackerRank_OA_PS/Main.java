package HackerRank_OA_PS;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {		// Space + Ctrl = auto complete

		// Ctrl + F11 = to rerun class
		
		// Ctrl Shift z to redo
		
		// sysout + ctrl + space
		
		
		Solution solution = new Solution();
		
		List<String> test1 = new ArrayList<>();
		test1.add("ACQUIRE 364");
		test1.add("ACQUIRE 84");
		test1.add("RELEASE 364");
		test1.add("RELEASE 64"); 
		System.out.println("Test1 :" + solution.solution2(test1) + "\n"); 
		// 3
		
		test1.clear(); 
		test1.add("ACQUIRE 364");
		test1.add("ACQUIRE 84");
		test1.add("RELEASE 84");
		test1.add("RELEASE 364");
		System.out.println("Test 4 :" + solution.solution2(test1) + "\n"); 
		// 3
		
		test1.clear(); 
		test1.add("ACQUIRE 364");
		test1.add("ACQUIRE 84");
		test1.add("ACQUIRE 364");
		test1.add("RELEASE 364");
		System.out.println("Test 2 :" + solution.solution2(test1) + "\n"); 
		// 3
 
		test1.clear(); 
		test1.add("ACQUIRE 123");
		test1.add("ACQUIRE 364");
		test1.add("ACQUIRE 84");
		test1.add("RELEASE 84");
		test1.add("RELEASE 364");
		test1.add("ACQUIRE 789");
		test1.add("RELEASE 456");
		test1.add("RELEASE 123");
		System.out.println("Test 3 :" + solution.solution2(test1) + "\n"); 
		// 7
 

	}
	
//	public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < arrCount; i++) {
//            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
//            arr.add(arrItem);
//        }
//
//        int k = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String result = Result.findNumber(arr, k);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }

}
