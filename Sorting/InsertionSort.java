/**
 * Insertion Sort Algorithm
 *
 * Description:
 * Insertion Sort works by picking one element at a time and inserting it into its correct position in the sorted part of the array. It is similar to how we sort playing cards in our hands.
 *  1. Assume the first element is already sorted.
 *  2. Take the next element and compare it with the sorted part.
 *  3️. Shift elements if needed and insert the element in the correct position.
 *  4️. Repeat until the array is sorted.
 *
 * Time Complexity:
 * - Best Case: O(n) [Already sorted array]
 * - Worst Case: O(n²) [Reversely sorted array]
 * - Average Case: O(n²)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 * 
 * Stability:
 *  - Yes
 */

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Element to be inserted in sorted part
            int j = i - 1;
            // Move elements that are greater than key, one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert the key at the correct position
            arr[j + 1] = key;
        }
    }

    // Function to print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {24, 2, 18, 96, -86, 0};
        System.out.println("Before Sorting:");
        printArray(arr);
        System.out.println();
        insertionSort(arr);
        System.out.println("After Sorting:");
        printArray(arr);
    }
}
