package sort;

import java.util.Arrays;

import utility.SortUtilities;

public class SelectionSort implements SortI{
	public void sort(final int[] a) {
		System.out.println("sort.SelectionSort: Before sort: " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[smallest] > a[j]) {
					smallest = j;
				}
			}
			SortUtilities.swap(a, smallest, i);
		}
		System.out.println("sort.SelectionSort: After sort: " + Arrays.toString(a));
	}
}