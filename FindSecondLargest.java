package weekend.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };

		// Arrange the array in ascending order

		int len = data.length;
		System.out.println("Array Lenght is " + len);
		Arrays.sort(data);
		// 2, 3,4,6,7,11

		//Pick the 2nd element from the last and print it
		System.out.println(data[data.length - 2]);

	}

}
