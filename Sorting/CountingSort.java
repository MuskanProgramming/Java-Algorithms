/**
 * Counting Sort Algorithm
 *
 * Description:
 * Counting Sort is a non-comparative sorting algorithm that sorts elements by counting occurrences and placing them in the correct index.
 * It works well when sorting numbers in a known range.
 *
 * Steps:
 * 1. Find the maximum value in the array to determine the range.
 * 2. Create a count array to store the frequency of each element.
 * 3. Modify the count array to store cumulative counts.
 * 4. Place elements into a new sorted array using the cumulative count.
 * 5. Copy the sorted array back to the original array.
 *
 * Time Complexity:
 * - Best Case: O(n + k) [k = range of input values]
 * - Worst Case: O(n + k)
 * - Average Case: O(n + k)
 *
 * Space Complexity:
 * - O(k) (Extra space for count array)
 *
 * Stability:
 * - Yes
 */

 public class CountingSort {
    static void countingSort(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        // Find the maximum value in the array
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        // Create and populate the count array
        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }

        // Modify count array to store cumulative counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the sorted array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1, 6, 8, 6};
        System.out.println("Before Sorting:");
        printArray(arr);
        System.out.println();
        countingSort(arr);
        System.out.println("After Sorting:");
        printArray(arr);
    }
}
