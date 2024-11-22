package accentDayTwo;
import java.util.Scanner;
public class firstProb {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        // Input: Number of printing jobs and time interval for arrival
	        System.out.print("Enter the number of printing jobs (N): ");
	        int N = sc.nextInt();
	        System.out.print("Enter the time interval for next job (X minutes): ");
	        int X = sc.nextInt();

	        // Calculate the waiting time for the last job
	        int waitingTime = (N - 1) * (10 - X); 
	        if (waitingTime < 0) {
	            waitingTime = 0;
	        }

	        // Output the result
	        System.out.println("The waiting time for the last job is: " + waitingTime + " minutes");

	        sc.close();

}
}

/*public class JobWaitTime {

    // Function to calculate wait time
    public static int calculateWaitTime(int input1, int input2) {
        int total = (input1 - 1) * 10;
        int last = (input1 - 1) * input2;
        int wait = total - last;

        if (wait <= 0) {
            return 0;
        } else {
            return wait;
        }
    }

    // Main method to run and test the function
    public static void main(String[] args) {
        // Sample input values (you can modify or take input from the user)
        int input1 = 5;
        int input2 = 7;

        // Call the function and print the result
        int result = calculateWaitTime(input1, input2);
        System.out.println("Wait time: " + result);
    }
}

*/










