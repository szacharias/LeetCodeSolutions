package EASY.SQRT;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    public int mySqrt(int x) {
    	if (x ==1 ) return 1;
        int start = 0 , end = x, midPoint = x/2;
        while(true) {  
        	if ( x < Math.pow(midPoint +1 ,2 ) && x >=  Math.pow(midPoint  ,2 )) {
        		return midPoint;
        	}else if (Math.pow(midPoint, 2) < x ){
        		start = midPoint+1;
        	}else if (Math.pow(midPoint, 2) > x ){
        		end = midPoint-1;
        	}
        	
        	midPoint = ( start + end ) /2; 
        }
    	 
    }
}