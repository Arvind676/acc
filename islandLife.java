package accentDayTwo;

public class islandLife {

	public class UserMainCode {

	    // Method to calculate rebound value based on the given formula
	    public static int rebound(int input1, int input2, int input3) {
	        // Calculate buy as input3 - (input3 // 7)
	        int buy = input3 - (input3 / 7);
	        
	        // Calculate total as input2 * input3
	        int total = input2 * input3;
	        
	        // Calculate maximum as input1 * buy
	        int maximum = input1 * buy;

	        // If maximum is less than total, return -1
	        if (maximum < total) {
	            return -1;
	        }

	        // Calculate minimum as total // input1
	        int minimum = total / input1;

	        // If total is not divisible by input1, add 1 to minimum
	        if (total % input1 != 0) {
	            minimum += 1;
	        }

	        // Return the minimum value
	        return minimum;
	    }

	    public static void main(String[] args) {
	        // Example input
	        int input1 = 5;  // Integer value
	        int input2 = 10; // Integer value
	        int input3 = 20; // Integer value

	        // Call the method and print the result
	        int result = rebound(input1, input2, input3);
	        System.out.println(result); // Output the calculated rebound value
	    }
	}

}
