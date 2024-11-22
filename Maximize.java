package accentDayTwo;

public class Maximize {

	public class UserMainCode {

	    // Method to count occurrences of input3 in input1 (String)
	    public static int count(String input1, int input2, String input3) {
	        // Check if input1 and input3 are valid
	        return input1.length()-input1.replace(input3, "").length();
	    }

	    public static void main(String[] args) {
	        // Example inputs
	        String input1 = "hello world";
	        int input2 = 5;  // This input is not used in the method, so it's just for reference
	        String input3 = "l";

	        // Call the count method and print the result
	        int result = count(input1, input2, input3);
	        System.out.println(result);  // Output: 3
	    }
	}

}
