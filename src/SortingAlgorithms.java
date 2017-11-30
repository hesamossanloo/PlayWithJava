import java.util.Arrays;

public class SortingAlgorithms {
	public void insertionSort() {
		final int[] a = {6, 2, 4, 5, 1, 3};

		System.out.println("InsertionSort: Before sort: " + Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[i]) {
					final int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("InsertionSort: After sort: " + Arrays.toString(a));
	}

	public void selectionSort() {
		final int[] a = {1, 2, 4, 5, 2, 3};
		System.out.println("SelectionSort: Before sort: " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[smallest] > a[j]) {
					smallest = j;
				}
			}
			final int swapVar = a[i];
			a[i] = a[smallest];
			a[smallest] = swapVar;
		}
		System.out.println("SelectionSort: After sort: " + Arrays.toString(a));
	}

	public void mergeSortStarter() {
		final int[] a = {0, 1, 2, 4, 5, 1, 3, 8};
		System.out.println("MergeSort: Before sort: " + Arrays.toString(a));
		mergeSort(a, 1, 7);
		System.out.println("MergeSort: After sort: " + Arrays.toString(a));
	}

	public void mergeSort(final int[] mainArray, final int startIndex, final int endIndex) {
		if (startIndex < endIndex) {
			int middleIndex = (endIndex + startIndex) / 2;
			mergeSort(mainArray, startIndex, middleIndex);
			mergeSort(mainArray, middleIndex + 1, endIndex);
			merge(mainArray, startIndex, middleIndex, endIndex);
		}
	}

	private int[] merge(final int[] mainArray, final int startIndex, final int middleIndex, final int endIndex) {
		final int[] leftArray = new int[middleIndex - startIndex + 1];
		final int[] rightArray = new int[endIndex - middleIndex];
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = mainArray[startIndex + i];
		}
		for (int j = 0; j < rightArray.length; j++) {
			rightArray[j] = mainArray[middleIndex + j + 1];
		}
		int i = 0;
		int j = 0;
		for (int z = startIndex; z < endIndex; z++) {
			if (leftArray[i] <= rightArray[j]) {
				mainArray[z] = leftArray[i];
				if (i < leftArray.length-1) {
					i++;
				}
			} else {
				mainArray[z] = rightArray[j];
				if (j < rightArray.length-1) {
					j++;
				}
			}
		}
		return mainArray;
	}

}
