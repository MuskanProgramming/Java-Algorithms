/**
 * Merge Sort Algorithm
 *
 * Description:
 * Merge Sort is a divide-and-conquer sorting algorithm that splits the array into halves,
 * recursively sorts them, and then merges the sorted halves.
 * 
 * Steps:
 * 1. Divide the array into two halves.
 * 2. Recursively sort both halves.
 * 3. Merge the sorted halves back together.
 *
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Worst Case: O(n log n)
 * - Average Case: O(n log n)
 *
 * Space Complexity:
 * - O(n) (Requires auxiliary space for merging)
 *
 * Stability:
 * - Yes (Preserves order of equal elements)
 */

 public class MergeSort {
    // Merge two sorted subarrays
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];

        for (int i = 0; i < n2; i++)
            rightArray[i] = arr[mid + 1 + i];

        // Merge the two sorted arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArray[i++];
        }
        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    // Recursive Merge Sort function
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            // Recursively sort the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {24, 2, 18, 96, -86, 0};
        System.out.println("Before Sorting:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
