
public class QuickSort {

	// Method to perform Quick Sort on an array
	public static void quickSort(int[] arr, int low, int high) {
		// Initialize variables to keep track of the range and pivot
		int start = low; // Starting index of the range
		int end = high; // Ending index of the range
		int mid = (low + high) / 2; // Calculate the middle index
		int pivot = arr[mid]; // Choose the pivot element as the middle element

		// Base case: If the low index is greater than or equal to the high index, return
		if (low >= high)
			return;

		// Partitioning the array
		while (start <= end) {
			// Find an element on the left side that is greater than the pivot
			while (arr[start] < pivot) {
				start++;
			}
			// Find an element on the right side that is smaller than the pivot
			while (arr[end] > pivot) {
				end--;
			}

			// Swap the elements found on the left and right sides
			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}

		// Recursively apply Quick Sort to the sub-arrays on both sides of the pivot
		quickSort(arr, low, end);
		quickSort(arr, start, high);
	}
}
