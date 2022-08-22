package com.expression;

import java.util.Stack;

public class Main {
	static public boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
			}
			if(ch == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
public static void main(String[] args) {
	System.out.println(isBalanced("(a+B)"));
	Expression exp = new Expression();
	System.out.println(exp.isBalanced("(a-b{a+b}*B)"));
}
}
