package accentDayTwo;

public class reverseArray {

	public class UserMainCode {

	    public static int rebound(int[] input1, int input2) {
	        int sum = 0;

	        // Reverse the array manually
	        for (int i = 0; i < input2; i++) {
	            int reversedIndex = input2 - 1 - i; // Calculate the reverse index
	            if (i % 2 == 0) {
	                sum += input1[reversedIndex]; // Add element if index is even
	            }
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        int[] input1 = {1, 2, 3, 4, 5, 6};
	        int input2 = 4;
	        System.out.println(rebound(input1, input2));  // Example Output: 10
	    }
	}

}
