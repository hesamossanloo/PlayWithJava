package sort;

import java.util.Arrays;

import utility.SortUtilities;

public class HeapSort implements SortI{


	public void sort(final int[] a) {
		System.out.println("sort: Before sort: " + Arrays.toString(a));
		final int n = a.length;

		final int heapSize = a.length;
		// Build heap (rearrange array)
		buildMaxHeap(a, heapSize);
		// One by one extract an element from heap
		for (int i = (heapSize - 1); i >= 0; i--) {
			SortUtilities.swap(a, 0, i);
			// call max heapify on the reduced heap
			maxHeapify(a, i, 0);
		}
		System.out.println("sort: After sort: " + Arrays.toString(a));
	}
	private void buildMaxHeap(final int[] a, final int heapSize) {
		for (int i = heapSize / 2 - 1; i >= 0; i--) {
			maxHeapify(a, heapSize, i);
		}
	}

	private void maxHeapify(final int[] a, final int heapSize, final int i) {
		int largest = i;
		final int left = 2 * i + 1;
		final int right = 2 * i + 2;
		// If left child is larger than root
		if (left < heapSize && a[left] > a[largest]) {
			largest = left;
		}
		// If right child is larger than largest so far
		if (right < heapSize && a[right] > a[largest]) {
			largest = right;
		}
		// If largest is not root
		if (largest != i) {
			SortUtilities.swap(a, i, largest);
			// Recursively heapify the affected sub-tree
			maxHeapify(a, heapSize, largest);
		}
	}
}