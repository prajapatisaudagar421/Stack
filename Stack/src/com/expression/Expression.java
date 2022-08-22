package com.expression;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
	private List left = Arrays.asList('(', '{', '[', '<');
	private List right = Arrays.asList(')', '}', ']', '>');
	public boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if(leftCheck(ch)) {
				stack.push(ch);
			}
			if(rightCheck(ch)) {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if(!bothCheck(top, ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public boolean leftCheck(char ch) {
		return left.contains(ch);
	}

	public boolean rightCheck(char ch) {
		return right.contains(ch);
	}
	public boolean bothCheck(char l,char r) {
		return left.indexOf(l) == right.indexOf(r);
	}
}
