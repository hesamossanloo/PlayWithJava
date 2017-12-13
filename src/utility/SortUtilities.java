package utility;

public class SortUtilities {
	public static void swap(final int[] array, final int i, final int j) {
		final int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}
}
