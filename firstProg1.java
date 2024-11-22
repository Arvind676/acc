package accentDayTwo;
import java.util.Scanner;
public class firstProg1 {
	public static int printingJob(int N, int X) {
			int total = (N - 1)* 10;
			int last = (N - 1)* X;
			int wait = total - last;
			if(wait<=0) {
				return 0;
			}else {
				return wait;
			}
		
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of printing jobs:");
			int N = sc.nextInt();
			System.out.println("Enter Time duration:");
			int X = sc.nextInt();
			
			int result = printingJob(N,X);
			System.out.println("Waiting time for the last job "+ result + "Minutes");
			
			}

}
