public class LinearSearch {

    // Linear search for an integer in an array
    public static int search(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Target found at index " + i);
                return i;
            } 
        }
        System.out.println("Target not found");
        return -1;
    }

    // Check if an integer is present in an array
    public static boolean contains(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Target found at index " + i);
                return true;
            } 
        }
        System.out.println("Target not found");
        return false;
    }

    // Linear search for a character in a string
    public static int search(String str, char target) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                System.out.println("Target found at index " + i);
                return i;
            } 
        }
        System.out.println("Target not found");
        return -1;
    }

    // Search for an integer in a 2D array and return its indices
    public static int[] search(int[][] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[] {i, j};
                }
            } 
        }
        return new int[] {-1, -1};
    }

    // Find the maximum element in an array
    public static int findMaxElem(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];        
        }
        return max;
    }

    // Find the minimum element in an array
    public static int findMinElem(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];        
        }
        return min;
    }

    // Count the total number of characters in a string
    public static int totalCharinString(String str) {
        int total = 0;
        int stringLength = str.length();
        while(stringLength != 0) {
            total++;
            stringLength--;
        }
        return total;
    }
    
    // Count the number of elements with more than four digits in an array
    public static int countFourDigitElem(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 999) {
                total++;
            }
        }
        return total;
    }
}
