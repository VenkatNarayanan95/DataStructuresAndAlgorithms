package com.dataStructures;

import java.util.Scanner;

class DynamicArray {
    final static int initialCapacity = 16;
    int arr[];
    int capacity;
    int size;

    public DynamicArray() {
        size = 0;
        arr = new int[initialCapacity];
        capacity = initialCapacity;
    }

    // Method to add a value to the dynamic array
    public void add(int val) {
        arr[size++] = val;
        // Check if the array is full, expand it if necessary
        if (size == capacity) {
            expandArray();
        }
    }

    // Method to expand the array by doubling its capacity
    public void expandArray() {
        arr = java.util.Arrays.copyOf(arr, capacity * 2);
        capacity *= 2;
    }

    // Method to display the elements of the dynamic array
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line after displaying the array
    }

    // Method to add a value at a specific position in the dynamic array
    public void addAtSpecPos(int pos, int val) {
        // Shift elements to the right to make space for the new element
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = val;
        size++; // Increment the size after adding the element
    }

    // Method to delete a value at a specific position in the dynamic array
    public void deleteAtSpecPos(int pos) {
        // Shift elements to the left to fill the gap created by deleting the element
        for (int i = pos + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--; // Decrement the size after deleting the element
    }
}

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray list = new DynamicArray();
        int pos;
        int val;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the option: ");
            System.out.println("1. Add a new number");
            System.out.println("2. View the array");
            System.out.println("3. Add a number at specific pos");
            System.out.println("4. Delete a number at specific pos");
            System.out.println("5. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the data to be added to array: ");
                    val = scanner.nextInt();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter the position:");
                    pos = scanner.nextInt();
                    if (pos < 0) {
                        System.out.println("Invalid position");
                    }
                    System.out.println("Enter the data: ");
                    val = scanner.nextInt();
                    list.addAtSpecPos(pos, val);
                    break;
                case 4:
                    System.out.println("Enter the position:");
                    pos = scanner.nextInt();
                    if (pos < 0) {
                        System.out.println("Invalid position");
                    }
                    list.deleteAtSpecPos(pos);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + option);
            }
        }
    }
}
