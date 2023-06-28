package weekend.day1;

public class PrintDuplicateArrays {

	public static void main(String[] args) {


	      int[] arr = {14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17,20};
	        
	        int length = arr.length; // Get the length of the array
	        
	        // Iterate from 0 to the array length - 1 (outer loop)
	        for (int i = 0; i < length; i++) {
	            int count = 0; // Assign 0 to count
	            
	            // Iterate from i to the length of the array (inner loop)
	            for (int j = i+1; j < length; j++) {
	                // Compare the elements at i and j and check if they are equal
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[i]); // Print the matching value
	                    count++;
	                }
	            }
	}
}
	}
