package searchAlgorithms;

// Binary Search implementation for a sorted array
public class BinarySearch {
	
	// Method to perform binary search
	public static int search(int[] arr, int target) {
		
		// Initialize the start and end indices of the search range
		int start = 0;
		int end = arr.length - 1;
		
		// Check if the array is in ascending or descending order
		boolean asc = false;
		if (arr[start] < arr[end]) {
			asc = true; // Set asc to true if the array is in ascending order
		}
		
		// Perform binary search
		while (start <= end) {
			// Calculate the middle index of the current search range
			int mid = (start + end) / 2;
			
			// Check if the target is greater, lesser, or equal to the middle element
			if (asc) { // Array is in ascending order
				if (target > arr[mid]) {
					start = mid + 1; // Adjust the start index for the next iteration
				} else if (target < arr[mid]) {
					end = mid - 1; // Adjust the end index for the next iteration
				} else {
					return mid; // Return the index if the target is found
				}
			} else { // Array is in descending order
				if (target < arr[mid]) {
					start = mid + 1; // Adjust the start index for the next iteration
				} else if (target > arr[mid]) {
					end = mid - 1; // Adjust the end index for the next iteration
				} else {
					return mid; // Return the index if the target is found
				}
			}
		} 
		return -1; // Return -1 if the target is not found in the array
	} 
}
