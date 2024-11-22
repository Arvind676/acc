package accentDayTwo;
import java.util.Scanner;
public class probThree {
	public static int bitwiseOR(int A, int B) {
		return A | B ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A integer:");
		int A= sc.nextInt();
		System.out.println("Enter B integer:");
		int B= sc.nextInt();
		
		int result = bitwiseOR(A,B);
		System.out.println("The result of bitwise Or operation is:"+ result);
		
		
	}

}
