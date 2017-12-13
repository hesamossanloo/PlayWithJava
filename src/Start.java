import sort.QuickSort;

public class Start {
	/*
	 * Initialize your Sorting class here and call the sort() method
	 */
	public static void main(String[] args) {
		final int[] a = {0, 1, 2, 8, 5, 1, 3, 4};
		QuickSort quickSort = new QuickSort();
		quickSort.sort(a);
	}
}
