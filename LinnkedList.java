import java.util.Iterator;

// Generic LinkedList class
public class LinkedList<T> implements Iterable<T> {
    Node head;

    // Node class to represent each element in the linked list
    class Node {
        T data;
        Node next;

        // Constructor to initialize a node with a value
        Node(T val) {
            data = val;
            next = null;
        }
    }

    // Constructor to initialize an empty linked list
    public LinkedList() {
        head = null;
    }

    // Add a new node with a given value at the beginning of the list
    public void addAtBeginning(T val) {
        Node newNode = new Node(val);
        if (head == null) { // If the list is empty
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Display the elements of the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Insert a new node with a given value at a specified position
    public void insertAtPos(int pos, T val) {
        Node newNode = new Node(val);
        Node temp = head;
        if (pos == 0) {
            addAtBeginning(val);
            return;
        }
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete a node at a specified position
    public void deleteAtpos(int pos) {
        Node temp = head;
        Node prev = null;
        if (pos == 0) {
            head = head.next;
            return;
        }
        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    // Get the value at a specified position
    public T get(int pos) {
        Node temp = head;
        if (pos == 0) {
            return head.data;
        }
        for (int i = 1; i <= pos; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Update the value at a specified position
    public void update(int pos, T val) {
        Node temp = head;
        if (pos == 0) {
            head.data = val;
        }
        for (int i = 1; i <= pos; i++) {
            temp = temp.next;
        }
        temp.data = val;
    }

    // Search for the index of a given value in the linked list
    public int search(T val) {
        Node temp = head;
        int index = 0;
        if (head.data.equals(val)) {
            return 0;
        }
        while (temp != null) {
            T currentVal = temp.data;
            if (currentVal.equals(val)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // Check if a given value is present in the linked list
    public boolean contains(T val) {
        Node temp = head;
        if (head.data.equals(val)) {
            return true;
        }
        while (temp != null) {
            T currentVal = temp.data;
            if (currentVal.equals(val)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Iterator implementation to iterate over the elements of the linked list
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }

    // Reverse the linked list
    public void reverseLinkedList() {
        Node current = head;
        Node prev = null;
        Node next = head.next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
