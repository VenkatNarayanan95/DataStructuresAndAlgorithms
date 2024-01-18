// Package declaration indicating the package structure
package com.DSA;

// Class definition for implementing a stack using arrays
public class StackUsingArrays {
  
    // Maximum size of the stack
    static final int MAX_SIZE = 30;
  
    // Array to store the stack elements
    int arr[] = new int[MAX_SIZE];
  
    // Variable to keep track of the top element in the stack
    int top;
  
    // Constructor to initialize the stack
    public StackUsingArrays() {
        // Initialize top to -1, indicating an empty stack
        top = -1;
    }
  
    // Method to push an element onto the stack
    public void push(int val) {
        // Check if the stack is full
        if (top == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Stack overflow");
        // Increment top and insert the value at the new top index
        arr[++top] = val;
    }
  
    // Method to pop an element from the stack
    public int pop() {
        // Check if the stack is empty
        if (top == -1) {
            throw new IndexOutOfBoundsException("Array is empty");
        }
        // Return the value at the current top index and decrement top
        return arr[top--];
    }
  
    // Method to peek at the top element of the stack without removing it
    public int peek() {
        // Return the value at the current top index
        return arr[top];
    }
  
    // Method to check if the stack is empty
    public boolean isEmpty() {
        // Return true if top is -1, indicating an empty stack
        return top == -1;
    }
  
    // Method to display the elements of the stack
    public void display() {
        // Iterate through the stack and print each element
        for (int i = 0; i < top + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
