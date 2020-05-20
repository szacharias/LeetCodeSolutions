package HackerRank_OA_PS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution {
	
	public String solution(List<Integer> arr, int k) {
		boolean hasFound = false;
		for ( int i = 0 ; i < arr.size() ; i ++) {
			if (arr.get(i) == k) {
				hasFound = true;
			}
		}
		if (hasFound == true) {
			return "YES";
		}else {
			return "NO";
		}
		
	}
	
	public int solution2(List<String> events) {
		HashMap<Integer, String> lockStatus = new HashMap<Integer, String>();
		String acquire = "ACQUIRE";
		String release = "RELEASE";
		for ( int i = 0 ; i < events.size(); i ++) {
			int lockNumber = Integer.valueOf(events.get(i).split("\\s+")[1]);
			String eventStatus = events.get(i).split("\\s+")[0];
			lockStatus.get(i);
			
			// if lock number exists
			if (lockStatus.containsKey(lockNumber)) {
				if (eventStatus == acquire ) {
					if (lockStatus.get(lockNumber) == acquire) {
						return i;
					}else if (lockStatus.get(lockNumber) == release){
						lockStatus.put(lockNumber, release);
					}
				}
			}
			//lock number does not exist, add new
			else {
				if(eventStatus == release) {
					return i;
				}else if (eventStatus == acquire) {
					lockStatus.put(lockNumber, eventStatus);
				}
			}
			
			
		}

	    Iterator it = lockStatus.entrySet().iterator();
	    while(it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        if (pair.getValue() == acquire) {
	        	return events.size() +1;
	        }
	    } 
		return 0;
	}
	 
}
