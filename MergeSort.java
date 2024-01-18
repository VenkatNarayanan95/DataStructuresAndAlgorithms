package sortAlgorithms;

import java.util.Arrays;

public class MergeSort {

    // Main function to perform Merge Sort
    public static int[] sort(int[] arr) {
        // Base case: If the array has only one element, it is already sorted
        if(arr.length == 1)
            return arr;

        // Divide the array into two halves
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));     // Recursive sort on the left half
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));  // Recursive sort on the right half

        // Merge the sorted halves
        return merge(left, right);
    }

    // Merge function to combine two sorted arrays
    public static int[] merge(int[] left, int[] right) {
        int[] joined = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and merge them in sorted order
        while(i < left.length && j < right.length) {
            if(left[i] < right[j])
                joined[k++] = left[i++];
            else
                joined[k++] = right[j++];
        }

        // Copy any remaining elements from the left array
        while(i < left.length) {
            joined[k++] = left[i++];
        }

        // Copy any remaining elements from the right array
        while(j < right.length) {
            joined[k++] = right[j++];
        }

        return joined;
    }

    // In-place Merge Sort
    public static void MergesortinPlace(int[] arr, int start, int end) {
        // Base case: If the subarray has only one or zero elements, it is already sorted
        if(end - start == 1)
            return;

        // Find the middle point of the array
        int mid = (start + end) / 2;

        // Merge the two halves in-place
        mergeInplace(arr, start, mid, end);
    }

    // In-place merge function
    public static void mergeInplace(int[] arr, int start, int mid, int end) {
        int[] joined = new int[end - start];
        int i = start, j = mid, k = 0;

        // Compare elements from both halves and merge them in sorted order
        while(i < mid && j < end) {
            if(arr[i] < arr[j])
                joined[k++] = arr[i++];
            else
                joined[k++] = arr[j++];
        }

        // Copy any remaining elements from the left half
        while(i < mid) {
            joined[k++] = arr[i++];
        }

        // Copy any remaining elements from the right half
        while(j < end) {
            joined[k++] = arr[j++];
        }

        // Copy the merged array back to the original array in-place
        for (k = 0; k < joined.length; k++) {
            arr[start + k] = joined[k];
        }
    }
}
