package accentDayTwo;

public class SecondOccurence1 {

	public class SecondHighestFrequency {

	    public static int findSecondHighestFrequency(int[] input2) {
	        // Initialize variables for the highest and second-highest unique values
	        int highest = Integer.MIN_VALUE;
	        int secondHighest = Integer.MIN_VALUE;

	        // Find the highest and second-highest unique values
	        for (int num : input2) {
	            if (num > highest) {
	                secondHighest = highest;
	                highest = num;
	            } else if (num > secondHighest && num < highest) {
	                secondHighest = num;
	            }
	        }

	        // If no valid second-highest value exists, return 0
	        if (secondHighest == Integer.MIN_VALUE) {
	            return 0;
	        }

	        // Count occurrences of the second-highest value in the original array
	        int count = 0;
	        for (int num : input2) {
	            if (num == secondHighest) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        // Example input
	        int[] input2 = {4, 1, 2, 2, 4, 3, 3, 5};

	        // Call the method and print the result
	        int result = findSecondHighestFrequency(input2);
	        System.out.println(result);
	    }
	}

}
