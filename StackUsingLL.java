package com.DSA;

public class StackUsingLL<T> {
    // Node class to represent elements in the linked list
    class Node {
        T data;
        Node next;

        // Constructor for creating a new node with a given value
        Node(T val) {
            data = val;
            next = null;
        }
    }

    // Top node of the stack
    Node top;

    // Constructor for initializing an empty stack
    StackUsingLL() {
        top = null;
    }

    // Push operation to add a new element to the stack
    public void push(T val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation to remove and return the top element from the stack
    public T pop() {
        if (top == null)
            throw new IndexOutOfBoundsException("Stack is Empty");

        T tmp = top.data;
        top = top.next;
        return tmp;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Peek operation to get the value of the top element without removing it
    public T peek() {
        return top.data;
    }
}
