package accentDayTwo;

public class reboundHeight {

	public class UserMainCode {

	    // Method to calculate the rebound value based on the formula
	    public static int rebound(int input1, int input2, int input3) {
	        // Calculate e as the ratio of input2 and input3
	        double e = (double) input2 / input3;

	        // Calculate the result manually as input1 * e^2
	        double res = input1 * e * e;

	        // Return the result as an integer (truncated)
	        return (int) res;
	    }

	    public static void main(String[] args) {
	        // Example input
	        int input1 = 5; // Integer value
	        int input2 = 10; // Integer value
	        int input3 = 2;  // Integer value

	        // Call the method and print the result
	        int result = rebound(input1, input2, input3);
	        System.out.println(result); // Output the calculated rebound value
	    }
	}

}
