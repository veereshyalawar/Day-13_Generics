

/*
 * Extending this and use options and use sorting
 */
import java.util.Arrays;

public class TestMax {
	public static void main(String[] args) {
		Integer xInt = 8, yInt = 2, zInt = 10;
		Float xFlt = 2.4f, yFlt = 8.5f, zFlt = 0.3f;
		String xSt = "V", ySt = "Veeresh", zSt = "Veeresh yalawar";

		Integer[] arrI = { xInt, yInt, zInt };
		Float[] arrF = { xFlt, yFlt, zFlt };
		String[] arrS = { xSt, ySt, zSt };

		System.out.println("Before sorting Elements");
		printArray(arrI);
		printArray(arrF);
		printArray(arrS);

		/*
		 * Here we are sorting array using Arrays.sort() method
		 */
		Arrays.sort(arrI);
		Arrays.sort(arrF);
		Arrays.sort(arrS);

		printArraySort(arrI);
		printArraySort(arrF);
		printArraySort(arrS);
/*
 * Here we are testing maximum using TestMaximum() method
 */
		System.out.println();
		testMaximum(xSt, ySt, zSt);
		testMaximum(xInt, yInt, zInt);
		testMaximum(xFlt, yFlt, zFlt);

	}

	private static <T> void printArraySort(T[] arr) {
		System.out.println("Sorted array[] is : " + Arrays.toString(arr));

	}

	/*
	 * Before sorting
	 */
	public static <T> void printArray(T[] arr) {
		Integer i;
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/*
	 * Testing the maximum value
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
	 * Printing the maximum value
	 */
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("max of %s,%s and %s is %s\n", x, y, z, max);
	}

}