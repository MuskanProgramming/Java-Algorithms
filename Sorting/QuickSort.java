/**
 * Quick Sort Algorithm
 *
 * Description:
 * Quick Sort is a divide-and-conquer algorithm that works by selecting a pivot element
 * and partitioning the array into two halves — one with elements smaller than the pivot
 * and one with elements larger than the pivot. The process is repeated recursively on both halves.
 *  1. Select a pivot (usually last element).
 *  2. Partition the array into two halves around the pivot.
 *  3️. Recursively apply quicksort to both halves.
 *  4️. Combine results to get the sorted array.
 *
 * Time Complexity:
 * - Best Case: O(n log n) [Balanced partitions]
 * - Worst Case: O(n²) [Unbalanced partitions, e.g., sorted array]
 * - Average Case: O(n log n)
 *
 * Space Complexity:
 * - O(log n) (Recursive stack for function calls)
 * 
 * Stability:
 * - No (Swaps can change the order of equal elements)
 */

 public class QuickSort {
    // Function to apply Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Function to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = low - 1; // Pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot element to correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Return pivot index
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
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting:");
        printArray(arr);
    }
}
