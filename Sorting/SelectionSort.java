/**
 * Selection Sort Algorithm
 *
 * Description:
 * Selection Sort works by selecting the smallest element from the unsorted part of the array
 * and swapping it with the first unsorted element. This process is repeated until the entire array is sorted.
 *  1. Find the minimum element from the unsorted part.
 *  2. Swap it with the first unsorted element.
 *  3️. Move the boundary between sorted and unsorted parts forward.
 *  4️. Repeat until the array is sorted.
 *
 * Time Complexity:
 * - Best Case: O(n²) [Scans entire array]
 * - Worst Case: O(n²)
 * - Average Case: O(n²)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 * 
 * Stability:
 * - No (Swapping can change the order of equal elements)
 */

 public class SelectionSort {
    // Function to apply Selection Sort
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);
        System.out.println("After Sorting:");
        printArray(arr);
    }
}