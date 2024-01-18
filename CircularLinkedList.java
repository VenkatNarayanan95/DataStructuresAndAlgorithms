package com.Dsa.LinkedList;

// CircularLinkedList class with generic type T
public class CircularLinkedList<T> {
    Node last; // Reference to the last node in the circular linked list
    
    // Node class represents a node in the circular linked list
    class Node {
        T data; // Data of the node
        Node next; // Reference to the next node
        
        // Constructor to initialize a new node with given value
        Node(T val) {
            data = val;
            next = null;
        }
    }

    // Constructor for CircularLinkedList
    public CircularLinkedList() {
        last = null; // Initially, the last node is set to null as the list is empty
    }

    // Method to insert a new node at the beginning of the circular linked list
    public void insertAtBeginning(T val) {
        Node newNode = new Node(val); // Create a new node with the given value
        if (last == null) { // If the list is empty
            last = newNode; // Set the last node to the new node
            newNode.next = last; // Make the new node point to itself
        } else { // If the list is not empty
            newNode.next = last.next; // Make the new node point to the first node
            last.next = newNode; // Make the last node point to the new node
        }
    }

    // Method to insert a new node at the end of the circular linked list
    public void insertAtEnd(T val) {
        Node newNode = new Node(val); // Create a new node with the given value
        if (last == null) { // If the list is empty
            last = newNode; // Set the last node to the new node
            newNode.next = last; // Make the new node point to itself
        } else { // If the list is not empty
            newNode.next = last.next; // Make the new node point to the first node
            last.next = newNode; // Make the last node point to the new node
            last = newNode; // Update the last node to be the new node
        }
    }
}
