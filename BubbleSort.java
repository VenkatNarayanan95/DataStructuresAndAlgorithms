package sortAlgorithms;

public class BubbleSort {
	
	// The BubbleSort class contains a single static method 'sort' to perform the Bubble Sort algorithm.

	public static void sort(int[] arr) {
		// The 'sort' method takes an array of integers as a parameter and sorts it in ascending order.

		for(int i=1; i < arr.length; i++) {
			// The outer loop iterates from the second element to the last element of the array.
			
			boolean swapped = false;
			// 'swapped' is a flag to check if any swapping occurred in the inner loop. 
			// If no swapping happens, the array is already sorted, and the algorithm can break out early.

			for (int j = 0; j < arr.length - i; j++) {
				// The inner loop iterates through the unsorted portion of the array.

				if (arr[j] > arr[j+1]) {
					// If the current element is greater than the next element, swap them.
					swapped = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				}
			}

			if (!swapped) {
				// If no swapping occurred in the inner loop, the array is already sorted.
				// Break out of the outer loop to optimize the algorithm.
				break;
			}
		}
	}
}
