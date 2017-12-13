package sort;

import java.util.Arrays;

import utility.SortUtilities;

public class QuickSort implements SortI {

	@Override
	public void sort(final int[] a) {
		System.out.println("QuickSort: Before sort: " + Arrays.toString(a));
		quickSort(a, 0, a.length - 1);
		System.out.println("QuickSort: After sort: " + Arrays.toString(a));
	}

	private void quickSort(final int[] a, final int lowIndex, final int highIndex) {
		if (lowIndex < highIndex) {
			/*
			 * partitionIndex is partitioning index, a[partitionIndex] is
			 * now at right place
			 */
			int partitionIndex = partition(a, lowIndex, highIndex);
			quickSort(a, lowIndex, partitionIndex - 1);
			quickSort(a, partitionIndex + 1, highIndex);
		}
	}

	/*
	 * This function takes last element as pivot,
	 * places the pivot element at its correct
	 * position in sorted array, and places all
	 * smaller (smaller than pivot) to left of
	 * pivot and all greater elements to right
	 * of pivot
	 */
	int partition(final int[] a, final int lowIndex, final int highIndex) {
		// Last elemet of the array is considered as the Pivot element
		final int pivotValue = a[highIndex];

		// Keeps the index of the smallest element
		int i = lowIndex - 1;
		// Finding the right position of pivotValue in the array
		for (int j = lowIndex; j < highIndex; j++) {
			if (a[j] <= pivotValue) {
				i++;
				SortUtilities.swap(a, i, j);
			}
		}
		SortUtilities.swap(a, i + 1, highIndex);

		return i + 1;
	}
}
