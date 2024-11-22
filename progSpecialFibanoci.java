package accentDayTwo;

public class progSpecialFibanoci {
	public class FibonacciModulo {

	    public static int calculateFibonacciModulo(int input1) {
	        // Create an array to store the Fibonacci values
	        int[] f = new int[input1 + 1];

	        // Initialize the first two values
	        f[0] = 1;
	        f[1] = 1;

	        // Calculate the Fibonacci values based on the formula
	        for (int i = 2; i <= input1; i++) {
	            f[i] = ((f[i - 1] * f[i - 1]) % 47 + (f[i - 2] * f[i - 2]) % 47) % 47;
	        }

	        // Return the result modulo 47
	        return f[input1] % 47;
	    }

	    public static void main(String[] args) {
	        // Example input
	        int input1 = 5;

	        // Call the method and print the result
	        int result = calculateFibonacciModulo(input1);
	        System.out.println(result);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
