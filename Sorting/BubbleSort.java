/**
 * Bubble Sort Algorithm
 *
 * Description:
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements, and swaps them if they are in the wrong order.
 * This process repeats until the list is sorted.
 *
 * Time Complexity:
 * - Best Case: O(n) [Already sorted array]
 * - Worst Case: O(n²) [Reversely sorted array]
 * - Average Case: O(n²)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 */

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred, array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {24, 2, 18, 96, -86};
        System.out.println("Before Sorting:");
        printArray(arr);
        System.err.println();
        bubbleSort(arr);
        System.out.println("After Sorting:");
        printArray(arr);
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
