package sortAlgorithms;

public class SelectionSort {
	
	// Method to perform selection sort on an array
	public static void sort(int[] arr) {
		// Outer loop to iterate through each element in the array
		for(int i = 0; i < arr.length; i++) {
			// Assume the current index is the minimum
			int min = i;
			
			// Inner loop to find the index of the minimum element in the unsorted portion
			for (int j = i + 1; j < arr.length; j++) {
				// Compare the current element with the assumed minimum
				if (arr[j] < arr[min]) {
					// Update the index of the minimum if a smaller element is found
					min = j;
				}
			}
			
			// Swap the minimum element with the first element in the unsorted portion
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
