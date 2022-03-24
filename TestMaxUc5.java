

/*
 * Extend the max method to also printing the max to standard out using Generic Method
 */
public class TestMaxUc5<T extends Comparable<T>> {
	T x, y, z;

	public TestMaxUc5(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return testMaximum(x, y, z);
	}

	/*
	 * Generic method of Type Integer,Float,String for finding maximum of 3
	 */
	private static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max;

		if (x.compareTo(y) == 1 && x.compareTo(z) == 1) {
			max = x;

		} else if (y.compareTo(x) == 1 && y.compareTo(z) == 1) {
			max = y;

		} else {
			max = z;
		}
		printMax(x, y, z, max);

		return max;
	}
	/*
	 * Create Generic method of name printMax
	 */

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("max of %s,%s and %s is :- %s\n", x, y, z, max);
	}

	public static void main(String[] args) {
		Integer xInt = 8, yInt = 5, zInt = 0;
		Float xFlt = 8.4f, yFlt = 6.5f, zFlt = 0.3f;
		String xSt = "V", ySt = "Veeresh", zSt = "Veeresh Yalawar";

		/*
		 * creating the objects of generic
		 */
		TestMaxUc5<Integer> integer = new TestMaxUc5<>(xInt, yInt, zInt);
		TestMaxUc5<Float> flt = new TestMaxUc5<>(xFlt, yFlt, zFlt);
		TestMaxUc5<String> string = new TestMaxUc5<>(xSt, ySt, zSt);

		/*
		 * calling methods for finding Maximum
		 */
		integer.maximum();
		flt.maximum();
		string.maximum();

	}

}