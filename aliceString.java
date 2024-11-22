package accentDayTwo;

public class aliceString {

	public static int findMaxWordLength(String input1) {
	    // Split the input string by "."
	    String[] arr = input1.split("\\.");  // Split the input string into words using ".".
	    int maxLen = 0;                      // Initialize maxLen to 0.

	    // Iterate over the array to find the maximum word length
	    for (String word : arr) {            // Loop through each word in the array.
	        if (word.length() > maxLen) {    // If the current word is longer than maxLen:
	            maxLen = word.length();      // Update maxLen to the current word's length.
	        }
	    }

	    // Return the maximum length
	    return maxLen;  // After checking all words, return the longest length found.
	}


}
