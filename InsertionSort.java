package sortAlgorithms;

public class InsertionSort {

    // Method to perform insertion sort on an array
    public static void sort(int[] arr) {
        // Outer loop starts from the second element of the array
        for (int i = 1; i < arr.length; i++) {
            // Inner loop iterates over the sorted portion of the array
            for (int j = i; j > 0; j--) {
                // Compare the current element with its previous element
                if (arr[j] < arr[j - 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    // Break out of the loop if the current element is greater than or equal to its previous element
                    // This is because the array before this position is already sorted
                    break;
                }
            }
        }
    }
}
