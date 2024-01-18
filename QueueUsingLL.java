package com.DSA;

// Generic Queue implementation using a Linked List
public class QueueUsingLL<T> {
    Node front;  // Front pointer to the first node in the queue
    Node rear;   // Rear pointer to the last node in the queue

    // Node class representing individual elements in the queue
    private class Node {
        T data;     // Data of the node
        Node next;  // Reference to the next node in the queue

        // Constructor to create a new node with given data
        Node(T val) {
            data = val;
            next = null;
        }
    }

    // Constructor to initialize an empty queue
    public QueueUsingLL() {
        front = null;
        rear = null;
    }

    // Method to add a new element to the end of the queue (enqueue)
    public void enqueue(T val) {
        Node newNode = new Node(val);  // Create a new node with the given data

        if (front == null)
            front = newNode;  // If the queue is empty, set both front and rear to the new node
        else
            rear.next = newNode;  // Otherwise, add the new node to the end of the queue

        rear = newNode;  // Update the rear pointer to the new node
    }

    // Method to remove and return the front element from the queue (dequeue)
    public T dequeue() {
        if (front == null)
            throw new NullPointerException("Queue is empty");  // Throw an exception if the queue is empty

        T temp = front.data;  // Get the data of the front node
        front = front.next;  // Move the front pointer to the next node

        if (front == null)
            rear = null;  // If the last node is removed, set the rear pointer to null

        return temp;  // Return the data of the removed node
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;  // Return true if the front pointer is null (queue is empty)
    }
}
