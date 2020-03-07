package Codility_OA;

import java.util.ArrayList; 
public class Solution {

	public String solution(int A, int B,int C ){
		boolean foundResults = false;
	    int numArr[] = {A,B,C};
	    String returnString = ""; 
	    String previousKey = "";  
	    while( foundResults == false) { 
	    	int max = Math.max(A , Math.max(B, C));  
	    	
	    	// Decide on the Character to use
	    	if (previousKey == "A" && max == A) { 
		    	max = Math.max( B, C); 
	    	}else if (previousKey == "B" && max == B) { 
		    	max = Math.max( A, C); 
	    	}else if (previousKey == "C" && max == C) { 
		    	max = Math.max( A, B); 
	    	}
	    	if (max == 0) {
	    		foundResults = true;
	    		return returnString;
	    	}
	    	
	    	
	    	// Decide on how many characters to use
	    	if (max == A && previousKey !="A" ) {
	    		int tester = max %2 ;
	    		if (tester == 1) {
	    			returnString = returnString + "a";
	    			A = A -1;
	    		}else {
	    			returnString = returnString + "aa";
	    			A = A - 2;
	    		}
	    		previousKey = "A";
	    		
	    	}else if (max == B  && previousKey !="B" ) {
	    		int tester = max %2 ;
	    		if (tester == 1) {
	    			returnString = returnString + "b";
	    			B = B -1;
	    		}else {
	    			returnString = returnString + "bb";
	    			B = B -2;
	    		}
	    		previousKey = "B";
	    	}else if (max == C  && previousKey !="C" ) { 
	    		int tester = max %2 ;
	    		if (tester == 1) {
	    			C = C -1 ;
	    			returnString = returnString + "c";
	    		}else {
	    			returnString = returnString + "cc";
	    			C = C -2;
	    		}
	    		previousKey = "C";
	    	}
	    	
	    	if (Math.max(A , Math.max(B, C)) == 0) {
	    		foundResults = true;
	    	}
	    }
	    return returnString;
	}
}
