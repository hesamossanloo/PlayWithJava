package sort;

import java.util.Arrays;

import utility.SortUtilities;

public class InsertionSort implements SortI{

	public void sort(final int[] a) {
		System.out.println("sort.InsertionSort: Before sort: " + Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[i]) {
					SortUtilities.swap(a, j, i);
				}
			}
		}
		System.out.println("sort.InsertionSort: After sort: " + Arrays.toString(a));
	}

}
