package Codility_CyclicRotation;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int[] solution(int[] A, int K) { 
		ArrayList test = new ArrayList<Integer>();
		int startingPosition = 0;
		if(A.length == 0 ) {
			startingPosition = 0;
		}else if (A.length > K) {  
			startingPosition = A.length - K ;   
		}else if (A.length < K) { 
			int divideK = K % A.length;
			startingPosition =  A.length - divideK ; 
		} 
		for(int i = 0 ; i < A.length ; i ++) { 
			if (startingPosition == A.length) {
				startingPosition = startingPosition - A.length;
			} 
			test.add(A[startingPosition]);
			startingPosition +=1;
		}
		int[] return_arr = new int[test.size()]; 
		for (int i = 0 ; i < test.size() ; i ++) {
			System.out.println(test.get(i));
			return_arr[i] = (Integer) test.get(i);
		}
		
		return return_arr;
        
        
    }
}
