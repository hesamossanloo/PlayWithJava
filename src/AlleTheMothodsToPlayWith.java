import java.util.Arrays;

public class AlleTheMothodsToPlayWith {
	public void testInsertionSort() {
		int[] a = {6, 2, 4, 6, 6, 3};
		System.out.println("Before sort: " + Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				while (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After sort: " + Arrays.toString(a));
	}

	public void testSelectionSort() {
		int[] a = {1, 2, 4, 5, 2, 3};
		System.out.println("Before sort: " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[smallest] > a[j]) {
					smallest = j;
				}
			}
			int swapVar = a[i];
			a[i] = a[smallest];
			a[smallest] = swapVar;
		}
		System.out.println("After sort: " + Arrays.toString(a));
	}

	public void testPassByValue() {
		int i1 = 0;
		int i2 = i1;
		i2 = 1;
		System.out.println(i1);
	}

	public void testPassByReference() {
		class X {
			int i = 0;
		}
		final X y = new X();
		X z = y;
		System.out.println(y.i);
		z.i = 1;
		System.out.println(y.i);
	}
}
