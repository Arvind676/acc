package accentDayTwo;

import java.util.Scanner;

public class fouthProb {
	public class EvenOddLabel {

	    public static String labelEvenOdd(int[] input1) {
	        StringBuilder res = new StringBuilder();

	        // Iterate through the array and label even or odd
	        for (int num : input1) {
	            if (num % 2 == 0) {
	                res.append("Even");
	            } else {
	                res.append("Odd");
	            }
	        }

	        return res.toString();
	    }
	}

}
