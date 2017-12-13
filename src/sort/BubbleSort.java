package sort;

import java.util.Arrays;

import utility.SortUtilities;

public class BubbleSort implements SortI{
	public BubbleSort() {
	}

	public void sort(final int[] a) {
		System.out.println("sort: Before sort: " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					SortUtilities.swap(a, i, j);
				}
			}
		}
		System.out.println("sort: After sort: " + Arrays.toString(a));
	}
}