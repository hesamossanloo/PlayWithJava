package sort;

import java.util.Arrays;

public class MergeSort implements SortI {

	@Override
	public void sort(int[] a) {
		System.out.println("MergeSort: Before sort: " + Arrays.toString(a));
		mergeSort(a, 0, a.length - 1);
		System.out.println("MergeSort: After sort: " + Arrays.toString(a));
	}

	private void mergeSort(final int[] mainArray, final int startIndex, final int endIndex) {
		if (startIndex < endIndex) {
			final int middleIndex = (endIndex + startIndex) / 2;
			mergeSort(mainArray, startIndex, middleIndex);
			mergeSort(mainArray, middleIndex + 1, endIndex);
			merge(mainArray, startIndex, middleIndex, endIndex);
		}
	}

	private void merge(final int[] mainArray, final int startIndex, final int middleIndex, final int endIndex) {
		final int n1 = middleIndex - startIndex + 1;
		final int n2 = endIndex - middleIndex;
		final int[] leftArray = new int[n1];
		final int[] rightArray = new int[n2];
		for (int i = 0; i < n1; i++) {
			leftArray[i] = mainArray[startIndex + i];
		}
		for (int j = 0; j < n2; j++) {
			rightArray[j] = mainArray[middleIndex + j + 1];
		}
		int i = 0;
		int j = 0;
		int k = startIndex;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				mainArray[k] = leftArray[i];
				i++;
			} else {
				mainArray[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			mainArray[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			mainArray[k] = rightArray[j];
			j++;
			k++;
		}
	}
}