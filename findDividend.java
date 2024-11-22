package accentDayTwo;

public class findDividend {

	public class UserMainCode {

	    // Method to find the index where the dividend is matched
	    public static int dividend(int[] input1, int input2, int input3, int input4, int input5) {
	        // Calculate the dividend
	        int dividend = input2 * input3 + input4;

	        // Loop through the input array to find the dividend
	        for (int i = 0; i < input1.length; i++) {
	            if (input1[i] == dividend) {
	                return i; // Return the index if dividend is found
	            }
	        }

	        // Return -1 if the dividend is not found in the array
	        return -1;
	    }

	    public static void main(String[] args) {
	        // Example input
	        int[] input1 = {10, 20, 30, 40}; // Array of integers
	        int input2 = 2; // Integer value
	        int input3 = 5; // Integer value
	        int input4 = 10; // Integer value
	        int input5 = 0; // Integer value (not used in the function)

	        // Call the method and print the result
	        int result = dividend(input1, input2, input3, input4, input5);
	        System.out.println(result); // Output the index of the dividend
	    }
	}

}
