package Codility_Test_Quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
 

public class Solution {

	public int returnSmallestNotInList(int A[]) {
		int checkArray[] = new int[A.length];
		int answer = 0;
		boolean foundAnswer = false;
		
		int check_all_length = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= A.length && A[i] > 0) {
				checkArray[A[i] - 1] = 1;

			}
		}
		
		
		
		for (int i = 0 ; i < checkArray.length ; i ++) {
			if (checkArray[i] != 0) {
				check_all_length +=1;
			}
		}  
		if (check_all_length== A.length) {
			answer = A.length+1;
			foundAnswer = true;
		}
		
		for (int i = 0; i < checkArray.length; i++) {
			if (checkArray[i] == 0 && foundAnswer == false) {
				answer = i + 1;
				foundAnswer = true;
			}
		}
		
//		 
		return answer;
	}

}
