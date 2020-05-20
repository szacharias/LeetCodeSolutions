package HackerRank_OA_AMC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	public String solution(List<Integer> arr, int k) {

		return "";

	}

	public int solution2(List<String> events) {

		return 0;
	}
 

	public static int minPartitions(List<Integer> used, List<Integer> total) {
		// Write your code here
		Collections.reverse(total);
		int total_values[] = new int[total.size()];

		// assign total values the sorted total
		for (int i = 0; i < total.size(); i++) {
			total_values[i] = total.get(i);
		}

		// count how many data i have to partition
		int all_used = 0;
		for (int i = 0; i < used.size(); i++) {
			all_used += used.get(i);
		}

		int required_partitions = 0;
		for (int i = 0; i < total_values.length; i++) {

			int temp_val = total_values[i];
			if (temp_val < all_used) {
				all_used = all_used - temp_val;
				required_partitions += 1;
			}
			// when the remaining is less than a partition
			else {
				required_partitions += 1;
				return required_partitions;
			}

		}

		return required_partitions;
	}

	public static int maxSubjectsNumber(List<Integer> answered, List<Integer> needed, int q) {
		// Write your code here
		List<Integer> required = answered;
		for (int i = 0; i < answered.size(); i++) {
			required.set(i, needed.get(i) - answered.get(i));
			
		}
		Collections.sort(required);
		int index = 0;
		while ((q- required.get(index)) >= 0 && index < required.size()) {
			q = q - required.get(index);
			index +=1 ;
		}
		return index;
	}

		

	public static int fewestCoins(String coins) {
		int all_letters[] = new int[26];
		Set<Integer> all_letters_char = new HashSet<>();
		
		char splitCoins[] = coins.toCharArray();
		for (int i = 0 ; i < splitCoins.length ; i ++) {
			
			int locationNumber = splitCoins[i] - 97 ; 
			all_letters[locationNumber] = 1;
			
			// set
			all_letters_char.add(locationNumber);
			
		}
		
		int endLocation = splitCoins.length - all_letters_char.size();
		int lastInitialPosition = splitCoins.length - endLocation;
		
		int additionalLength = 0;
		boolean foundSolution = false;
		for( int i  = 0 ; i < all_letters.length ; i ++) {
			System.out.println(all_letters[i]);
		}
		System.out.println("End");
		
		// Loop through shortest length
		while(foundSolution == false && additionalLength + all_letters_char.size()   < splitCoins.length) {
			
			
			//Loop through all the start positions
			for (int i = 0 ; i < lastInitialPosition + additionalLength  ; i ++) {
				
				// init settings
				int appearedLetters[] = all_letters;
				
				// Loop through all values
				for(int j = i ; j <= endLocation + additionalLength ; j ++) { 
					
					if ( appearedLetters[ (int)splitCoins[j] - 97 ] == 1  ) { 
						appearedLetters[ (int)splitCoins[j] - 97 ] = 0 ;
					}
				}
				
				boolean has_1_value = false;
				for(int j = 0 ; j < appearedLetters.length ; j ++) {
					 if (appearedLetters[j] == 1) {
						has_1_value = true;
					 } 
					 System.out.print(appearedLetters[j]);
				}
				System.out.println();
				if (has_1_value == false) {
					System.out.println(additionalLength);
					System.out.println(all_letters_char.size());
					return additionalLength + all_letters_char.size();
				}
				
				
			}
			System.out.println("Add!");
			additionalLength +=1 ;
		}
		

		System.out.println(additionalLength);
		System.out.println(all_letters_char.size()); 
		return splitCoins.length;
	}
	
	
	
	
}
