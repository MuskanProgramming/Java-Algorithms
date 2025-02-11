/**
 * Heap Sort Algorithm
 *
 * Description:
 * Heap Sort is a comparison-based sorting technique based on a Binary Heap data structure.
 * 1. Build a max heap from the input array.
 * 2. Swap the root (largest value) with the last element and reduce the heap size.
 * 3. Heapify the root to maintain the max heap property.
 * 4. Repeat the process until the heap is empty.
 *
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Worst Case: O(n log n)
 * - Average Case: O(n log n)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 * 
 * Stability:
 * - No
 */

 public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i; // Root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {24, 2, 18, 96, -86, 0};
        System.out.println("Before Sorting:");
        printArray(arr);

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
