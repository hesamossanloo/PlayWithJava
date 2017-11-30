import java.util.Arrays;

public class AlleTheMothodsToPlayWith {

	public void test() {
		int[] b,c;
		b=c= new int[5];
		b[4] = 9;
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
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
