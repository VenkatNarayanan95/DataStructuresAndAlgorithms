package com.DSA;

public class QueueUsingArrays {
    static final int MAX_SIZE = 30; // Maximum size of the queue
    int arr[] = new int[MAX_SIZE]; // Array to store queue elements
    int last; // Index of the last element in the queue
    
    // Constructor initializes the queue with an empty state
    public QueueUsingArrays() {
        last = -1; // Initialize last to -1 indicating an empty queue
    }
    
    // Method to add an element to the end of the queue (enqueue operation)
    public void enqueue(int val) {
        if (last == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Queue is Full"); // Check if the queue is full
        
        arr[++last] = val; // Increment last and add the new element to the end
    }
    
    // Method to remove and return the element from the front of the queue (dequeue operation)
    public int dequeue() {
        if (last == -1)
            throw new IndexOutOfBoundsException("Queue is Empty"); // Check if the queue is empty
        
        int temp = arr[0]; // Store the first element in a temporary variable
        
        // Shift all elements to the left to fill the gap
        for (int i = 1; i <= last; i++)
            arr[i - 1] = arr[i];
        
        last--; // Decrement last to reflect the removal of the first element
        return temp; // Return the removed element
    }
    
    // Method to check if the queue is empty
    public boolean isEmpty() {
        return last == -1; // If last is -1, the queue is empty
    }
}
