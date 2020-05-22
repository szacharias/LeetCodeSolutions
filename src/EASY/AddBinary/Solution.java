package EASY.AddBinary;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    public String addBinary(String a, String b) {  
    	StringBuilder sbA = new StringBuilder();
    	StringBuilder sbB = new StringBuilder();
    	StringBuilder sbReturn = new StringBuilder();
    	sbA.append(a);
    	sbB.append(b);
    	int lengthA = a.length();
    	int lengthB = b.length();    	
    	int longestLength = Math.max( lengthA, lengthB );
    	int indexA = lengthA , indexB = lengthB;
    	int carry = 0;
    	for (int i = longestLength ; i >=0 ; i --) {
    		
    		int localMax = carry;
    		if (indexA != 0) {
    			int tempA =  Integer.parseInt(sbA.charAt(indexA-1) + ""); 
    			localMax += Integer.parseInt(sbA.charAt(indexA-1) + ""); 
    			indexA -=1;
    		}
    		if (indexB!= 0) { 
    			int tempB =  Integer.parseInt(sbB.charAt(indexB-1) + ""); 
    			localMax += Integer.parseInt(sbB.charAt(indexB-1) + ""); 
    			indexB -=1; 
    		}
    		if (localMax == 2) {
    			carry = 1;
    			sbReturn.insert(0, 0);
    		}else if(localMax == 3){
    			carry = 1;
    			sbReturn.insert(0, 1);
    		}else {
    			carry = 0;
    			sbReturn.insert(0, localMax);
    		} 
    	}
    	
    	if (Integer.parseInt(sbReturn.charAt(0)+"") == Integer.parseInt("0")) {
    		sbReturn.deleteCharAt(0);
    	}
    	return sbReturn.toString();
    }
}