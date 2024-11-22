package accentDayTwo;
import java.util.Scanner;

public class FileVersion {

    public static int latestVersion(String[] S, int size) {
        // Initialize variable to store the latest version
        int latest = -1;

        // Loop through the array of file names
        for (int i = 0; i < size; i++) {
            // Check if the file name follows the format "File X"
            if (S[i].matches("File \\d+")) {
                // Extract the version number
                int version = Integer.parseInt(S[i].split(" ")[1]);

                // Update the latest version
                if (version > latest) {
                    latest = version;
                }
            }
        }

        // Return the latest version or -1 if no valid file found
        return latest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the number of files: ");
        int size = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        // Input: String array of file names
        System.out.println("Enter the file names:");
        String[] S = new String[size];
        for (int i = 0; i < size; i++) {
            S[i] = sc.nextLine();
        }

        // Find and print the latest version
        int result = latestVersion(S, size);
        System.out.println("The latest version is: " + result);

        sc.close();
    }
}
