import java.util.Arrays;

public class SortingAlgorithms implements SortingAlgorithmsI {
	@Override
	public void insertionSort(final int[] a) {
		System.out.println("InsertionSort: Before sort: " + Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[i]) {
					swap(a, j, i);
				}
			}
		}
		System.out.println("InsertionSort: After sort: " + Arrays.toString(a));
	}

	@Override
	public void selectionSort(final int[] a) {
		System.out.println("SelectionSort: Before sort: " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[smallest] > a[j]) {
					smallest = j;
				}
			}
			swap(a, smallest, i);
		}
		System.out.println("SelectionSort: After sort: " + Arrays.toString(a));
	}

	@Override
	public void mergeSortStarter(final int[] a) {
		System.out.println("MergeSort: Before sort: " + Arrays.toString(a));
		mergeSort(a, 1, 7);
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
				if (i < leftArray.length - 1) {
					i++;
				}
			} else {
				mainArray[z] = rightArray[j];
				if (j < rightArray.length - 1) {
					j++;
				}
			}
		}
		return mainArray;
	}

	@Override
	public void bubbleSort(final int[] a) {
		System.out.println("bubbleSort: Before sort: " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
		System.out.println("bubbleSort: After sort: " + Arrays.toString(a));
	}

	private void swap(int[] array, int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}

	@Override
	public void heapSort(int[] a) {
		buildMaxHeap(a);
		maxHeapify(a, 1);
	}

	private void maxHeapify(int[] a, int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int largest = 0;
		if (left <= a.length && a[left] > a[i]) {
			largest = left;
		} else {
			largest = i;
		}
		if(right<=a.length){

		}
	}
}
