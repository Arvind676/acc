package accentDayTwo;

public class cleanString {

	public class UserMainCode {

	    public static String rebound(String input1, String input2) {
	        String res = "";

	        // Loop through input1 and append characters not in input2 to res
	        for (char c : input1.toCharArray()) {
	            if (input2.indexOf(c) == -1) {
	                res += c;
	            }
	        }

	        return res.isEmpty() ? "Empty" : res;
	    }

	    public static void main(String[] args) {
	        String input1 = "abcdef";
	        String input2 = "acdf";
	        System.out.println(rebound(input1, input2));  // Output: "be"
	    }
	}

}
