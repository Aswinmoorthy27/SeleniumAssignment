package weekend.day1;

public class FindIntersection {
	public static void main(String[] args) {

		// Declare An array
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int len = a.length;

		// Declare another array
		int[] b = { 1, 2, 8, 4, 9, 7 };
		int lenb = b.length;

		// Declare for loop iterator from 0 to array length
		for (int i = 0; i < len; i++) {
			// Declare a nested for another array from 0 to array length
			for (int j = 0; j < lenb; j++) {
				// Compare Both the arrays using a condition statement
				if (a[i] == b[j]) {

					// printing array
					System.out.println("Matched Array is Printing " + a[i]);
				}

			}

		}

	}

}
