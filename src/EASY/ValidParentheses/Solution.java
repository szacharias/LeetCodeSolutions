package EASY.ValidParentheses;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

	// Hash table that takes care of the mappings.
	private HashMap<Character, Character> mappings;

	// Initialize hash map with mappings. This simply makes the code easier to read.
	public Solution() {
		this.mappings = new HashMap<Character, Character>();
		this.mappings.put(')', '(');
		this.mappings.put('}', '{');
		this.mappings.put(']', '[');
	}

	public boolean isValid(String s) {

		// Initialize a stack to be used in the algorithm.
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			
			// c = every letter
			char c = s.charAt(i);
			System.out.println( );
			// If the current character is a closing bracket.
			if (this.mappings.containsKey(c)) {

				// Get the top element of the stack. If the stack is empty, set a dummy value of
				// '#'
				char topElement = stack.empty() ? '#' : stack.pop();

				// If the mapping for this bracket doesn't match the stack's top element, return
				// false.
				if (topElement != this.mappings.get(c)) {
					return false;
				}
			} else {
				// If it was an opening bracket, push to the stack.
				stack.push(c);
			}
		}

		// If the stack still contains elements, then it is an invalid expression.
		return stack.isEmpty();
	}
	/*
	 * public boolean isValid(String s) { Map<String, Integer> appearance = new
	 * HashMap<String, Integer>(); appearance.put("(", 0); appearance.put(")", 0);
	 * appearance.put("[", 0); appearance.put("]", 0); appearance.put("{", 0);
	 * appearance.put("}", 0); char sArr[] = s.toCharArray(); int totalEntries =
	 * s.toCharArray().length; int index = 0; while( index < totalEntries) { if (
	 * sArr[index] == "{".charAt(0) ) { int cur = appearance.get("{");
	 * appearance.put("{", cur +1 ); } else if ( sArr[index] == "(".charAt(0) ) {
	 * int cur = appearance.get("("); appearance.put("(", cur +1 ); } else if (
	 * sArr[index] == "[".charAt(0) ) { int cur = appearance.get("[");
	 * appearance.put("[", cur +1 ); }else if ( sArr[index] == "}".charAt(0) ) {
	 * 
	 * int curStart = appearance.get("{"); if (curStart == 0 ) {return false;}
	 * 
	 * int cur = appearance.get("}"); appearance.put("}", cur +1 );
	 * appearance.put("{", curStart -1);
	 * 
	 * } else if ( sArr[index] == ")".charAt(0) ) {
	 * 
	 * 
	 * int curStart = appearance.get("("); if (curStart == 0) {return false;}
	 * 
	 * int cur = appearance.get(")"); appearance.put(")", cur +1 );
	 * appearance.put("(", curStart -1);
	 * 
	 * 
	 * } else if ( sArr[index] == "]".charAt(0) ) {
	 * 
	 * int curStart = appearance.get("["); if (curStart == 0) {return false;} int
	 * cur = appearance.get("]"); appearance.put("]", cur +1 ); appearance.put("[",
	 * curStart -1);
	 * 
	 * 
	 * }
	 * 
	 * 
	 * index += 1; }
	 * 
	 * if (appearance.get("(") == 0 || appearance.get("{") ==0 ||
	 * appearance.get("[") ==0 || appearance.get("}") ==0 || appearance.get("]") ==0
	 * || appearance.get(")") ==0 ) { return true; }else { return false; }
	 * 
	 * }
	 * 
	 */
}
