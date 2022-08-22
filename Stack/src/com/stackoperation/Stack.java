package com.stackoperation;

import java.util.Arrays;

public class Stack {
	private int[] arr;
	private int count;

	public Stack(int size) {
		arr = new int[size];
	}
	public String toString() {
		//int[] content = Arrays.copyOf(arr, count);
		return Arrays.toString(arr);
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("stackoverflow");
			return;
		}
		arr[count] = data;
		count++;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stackunderflow");
			return -1;
		}
		return arr[--count] = 0;
	}
	public int peek() {
		return arr[--count];
	}
	public boolean isEmpty() {
		return count == 0;
	}
	public boolean isFull() {
		return count == arr.length;
	}

}
