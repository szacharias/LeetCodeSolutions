package Codility_OA;

import java.util.ArrayList; 
public class Solution {

	public String solution(int A, int B,int C ){
		
		// Init Vars
		boolean foundResults = false;
	    int numArr[] = {A,B,C};
	    String returnString = ""; 
	    String previousKey = "";  
	    int consecutiveStringsA = 0;
	    int consecutiveStringsB = 0;
	    int consecutiveStringsC = 0; 
	    boolean notA = false;
	    boolean notB = false;
	    boolean notC = false;
	    
	    // Choose next letter
	    while( foundResults == false) { 
	    	int max = Math.max(A , Math.max(B, C));  
	    	
	    	// Decide on the Character to use
	    	if ( (previousKey == "A" && max == A ) && consecutiveStringsA == 2  ) { 
	    		notA = true;
		    	max = Math.max( B, C); 
		    	consecutiveStringsA = 0;
	    	}else if (previousKey == "B" && max == B && consecutiveStringsB == 2  ) { 
	    		notB = true;
		    	max = Math.max( A, C); 
		    	consecutiveStringsB = 0;
	    	}else if (previousKey == "C" && max == C && consecutiveStringsC == 2  ) { 
	    		notC = true;
		    	max = Math.max( A, B); 
		    	consecutiveStringsC = 0;
	    	} 
	    	if (max == 0) {
	    		foundResults = true;
	    		return returnString;
	    	}
	    	
	    	// Decide on how many characters to use and insert
	    	if (max == A  && notA == false) {   
    			returnString = returnString + "a";
    			A = A -1; 
	    		previousKey = "A";
	    		consecutiveStringsA +=1;
	    	    consecutiveStringsB = 0;
	    	    consecutiveStringsC = 0; 
	    		notB = false;
	    		notC = false;
	    		
	    	}else if (max == B  && notB == false ) {
	    		returnString = returnString + "b";
    			B = B -1; 
	    		previousKey = "B";
	    		consecutiveStringsA = 0;
	    	    consecutiveStringsB +=1 ;
	    	    consecutiveStringsC = 0; 
	    		notA = false;
	    		notC = false;
	    	}else if (max == C && notC == false  ) {  
	    		returnString = returnString + "c";
    			C = C -1; 
	    		previousKey = "C";
	    		consecutiveStringsA = 0;
	    	    consecutiveStringsB = 0 ;
	    	    consecutiveStringsC += 1; 
	    		notB = false;
	    		notA = false;
	    		
	    	}
	    	
	    	if (Math.max(A , Math.max(B, C)) == 0) {
	    		foundResults = true;
	    	}
	    }
	    return returnString;
	}
}
