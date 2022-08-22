package com.stackoperation;

public class Main {
public static void main(String[] args) {
	Stack stack = new Stack(5);
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	System.out.println(stack);
	stack.pop();
	stack.pop();
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack.isEmpty());
	System.out.println(stack.isFull());
}
}
