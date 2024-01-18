
public class DoublyLinkedList<T> {
    // Node class represents individual elements of the doubly linked list
    class Node {
        T data;
        Node next;
        Node prev;

        // Constructor to initialize a node with data
        Node(T val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    // Head and tail pointers of the doubly linked list
    Node head;
    Node tail;

    // Constructor to initialize an empty doubly linked list
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Add a new node with the given value at the beginning of the list
    public void addAtBeginning(T val) {
        Node newNode = new Node(val);
        newNode.next = head;
        
        // If the list is empty, update the tail
        if (head == null) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        
        head = newNode;
    }

    // Display the elements of the list from head to tail
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Display the elements of the list from tail to head
    public void reverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    // Add a new node with the given value at a specified position
    public void addAtPos(int pos, T val) {
        // If position is 0, add at the beginning
        if (pos == 0) {
            addAtBeginning(val);
            return;
        }
        
        Node newNode = new Node(val);
        Node temp = head;

        // Traverse to the specified position
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            
            // If the position is out of bounds, throw an exception
            if (temp == null) {
                throw new IndexOutOfBoundsException();
            }
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        // Update tail if the new node is the last node
        if (temp == tail) {
            tail = newNode;
        } else {
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // Delete a node at the specified position
    public void deleteAtpos(int pos) {
        Node temp = head;
        Node prev = null;

        // If position is 0, delete from the beginning
        if (pos == 0) {
            head = head.next;

            // Update tail if the list becomes empty
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            return;
        }

        // Traverse to the specified position
        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;

            // If the position is out of bounds, throw an exception
            if (temp == null) {
                throw new IndexOutOfBoundsException();
            }
        }

        prev.next = temp.next;

        // Update tail if the deleted node is the last node
        if (temp.next == null) {
            tail = prev;
        } else {
            temp.next.prev = prev;
        }
    }

    // Get the value at the specified position
    public T get(int pos) {
        Node temp = head;

        // If position is 0, return the value of the head
        if (pos == 0) {
            return head.data;
        }

        // Traverse to the specified position
        for (int i = 1; i <= pos; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    // Update the value at the specified position
    public void update(int pos, T val) {
        Node temp = head;

        // If position is 0, update the value of the head
        if (pos == 0) {
            head.data = val;
        }

        // Traverse to the specified position
        for (int i = 1; i <= pos; i++) {
            temp = temp.next;
        }

        temp.data = val;
    }

    // Placeholder method for deleting the node at the end
    public void deleteAtEnd() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        // If there is only one node in the list, set both head and tail to null
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        // Update tail to the previous node and remove the connection to the last node
        tail = tail.prev;
        tail.next = null;
    }

    // Placeholder method for inserting a node at the end
    public void insertAtEnd(T val) {
        // Create a new node with the given value
        Node newNode = new Node(val);

        // Check if the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // Connect the new node to the current tail
        tail.next = newNode;
        newNode.prev = tail;

        // Update tail to the new node
        tail = newNode;
    }

    // Search for the index of a specific value in the list
    public int search(T val) {
        Node temp = head;
        int index = 0;

        // Check if the value is at the head
        if (head.data == val) {
            return 0;
        }

        // Traverse the list to find the value
        while (temp != null) {
            T currentVal = temp.data;

            // Compare using .equals() for generic types
            if (currentVal.equals(val)) {
                return index;
            }

            temp = temp.next;
            index++;
        }

        // Value not found
        return -1;
    }

    // Check if the list contains a specific value
    public boolean contains(T val) {
        Node temp = head;

        // Check if the value is at the head
        if (head.data == val) {
            return true;
        }

        // Traverse the list to find the value
        while (temp != null) {
            T currentVal = temp.data;

            // Compare using .equals() for generic types
            if (currentVal.equals(val)) {
                return true;
            }

            temp = temp.next;
        }

        // Value not found
        return false;
    }
}
