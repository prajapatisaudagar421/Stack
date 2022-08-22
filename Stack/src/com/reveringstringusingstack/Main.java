package com.reveringstringusingstack;

import java.util.Stack;

public class Main {
	static String reverseString(String str) {
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			stack.push(ch);
		}
		StringBuffer reverse = new StringBuffer();
		while (!stack.isEmpty()) {
			reverse.append(stack.pop());
		}
		return reverse.toString();
	}
public static void main(String[] args) {
	System.out.println(reverseString("saudagar"));
}
}
