import sort.MergeSort;

public class Start {
	public static void main(String[] args) {
		final int[] a = {0, 1, 2, 4, 5, 1, 3, 8};
//		HeapSort heapSort = new HeapSort();
//		heapSort.sort(a);
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(a);
	}
}
