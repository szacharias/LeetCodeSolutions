package Coding_Playground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

public class Solution {
	
	public int returnSmallestNotInList(int A[]){
		int checkArray[] = new int[A.length];
		int answer = 0;
		boolean foundAnswer = false;
		for (int i = 0 ; i < A.length ; i ++) { 
			if (A[i] < A.length && A[i] > 0) {
				checkArray[A[i]-1] = 1; 
				
			} 
		} 
		for( int i = 0 ; i < checkArray.length ; i ++) {
			if (checkArray[i] == 0 && foundAnswer == false) {
				answer =  i+1;
				foundAnswer = true;
			}
		}
//		 
		return answer;
	}
	
	
    public static String generateString(Map<Character, Integer> map) {
		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = 
	            new PriorityQueue<Map.Entry<Character, Integer>>((a, b) -> b.getValue() - a.getValue());
	    
		int cnt = 0;
		for (Map.Entry<Character, Integer> e: map.entrySet()) {
			cnt += e.getValue();
			maxHeap.add(e);
		} 
		
	    // only one char can be on hold
	    Map.Entry<Character, Integer> onHold = null;
	    
	    StringBuilder sb = new StringBuilder();
	    
	    while (!maxHeap.isEmpty()) {
	    	Map.Entry<Character, Integer> cur = maxHeap.poll();
	    	sb.append(cur.getKey());
	    	
	    	if (onHold != null) {
	    		maxHeap.add(onHold);
	    		onHold = null;
	    	}
    		int curValue = cur.getValue();
    		if (curValue > 1) {
    			cur.setValue(curValue-1);
    			if (sb.length() >= 2 && cur.getKey() == sb.charAt(sb.length()-2)) { // on hold
	    			onHold = cur;
    			} else {  // add back to heap
    				maxHeap.add(cur);
    			}
    		}
	    
	    }
	    System.out.println(sb.toString());
	    return sb.length() == cnt ? sb.toString(): "";
	}

	
	
	public void tester() {
		
		
		
		// PRIORITY QUEUE
//		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		
		
		
		
		
		// STRING BUILDER
//		StringBuilder sb = new StringBuilder();
//		sb.append("a");
//		sb.append("b");
//		sb.append(1);
//		sb.insert(2, true);
//		sb.deleteCharAt(2);
//		sb.delete(2, 6);
//
////		System.out.print(sb.toString());
//
//		// LINKEDLIST
//
//		LinkedList<String> ll = new LinkedList<String>();
//
//		ll.add("12");
//
//		ll.add("12");
//
//		ll.add("13");
//
//		System.out.println(ll.get(2));
//		System.out.print(ll.getLast());
//		System.out.println();
//		System.out.println(ll.offerFirst("10"));
//		System.out.println(ll.offerLast("19"));
//		System.out.println(ll.offerLast("20"));
//
//		System.out.println(ll.peek());
//
//		System.out.println(ll.toString());
//		System.out.println(ll.pop());
//
//		System.out.println(ll.toString());
//
//		System.out.println(ll.toString());
//		System.out.println(ll.contains(11));
//
//		// LIST ITERATOR
//		System.out.println(ll.toString());
//
//		ListIterator<String> listIter = ll.listIterator(); 
//		boolean found = false;
//		String search = "13";
//		String item = listIter.next();
//		int index = 0 ;
//		int found_index = 0 ;
//		while (found == false && index < ll.size()) {
//			System.out.println(index);
//			System.out.println(ll.size());
//			System.out.println(ll.toString());
//			// if equals then remove 
//			if (item.equals(search)) {
//				
//				if (listIter.hasPrevious()) {
//					
//					System.out.println("has previous " + ll.toString()); 
//					System.out.println(listIter.nextIndex());
//					System.out.println(listIter.previousIndex());
//					listIter.previous();  
//					
//					System.out.println("has previous 1" + ll.toString());
//					
//					listIter.remove();
//					System.out.println(listIter.nextIndex());
//					System.out.println(listIter.previousIndex());
//					
//					System.out.println("has previous 2" + ll.toString());
//
//					System.out.println(listIter.nextIndex());
//					System.out.println(listIter.previousIndex());
//					listIter.next();
//					System.out.println("has previous end" + ll.toString());
//				}
//
//				if (listIter.hasNext()) {
//					System.out.println("has next" + ll.toString());
//					listIter.next();
//					listIter.remove();
//					System.out.println("has next end" + ll.toString());
//				} 
//				found = true;
//				found_index = index;
//			}
//			if (found == true) break;
//			item = listIter.next();
//			index +=1; 
//		}
//
//		System.out.println(ll.toString());

	}

}
