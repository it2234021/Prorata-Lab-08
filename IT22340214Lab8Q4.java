import java.util.Scanner;

public class IT22340214Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int numStudents = 0;

        // Loop to insert 8 student IDs with input validation
        while (numStudents < 8) {
            System.out.print("Enter Student ID for Student " + (numStudents + 1) + ": ");
            if (input.hasNextInt()) {
                int studentID = input.nextInt();
                if (studentID > 0) {
                    studentsArray[numStudents] = studentID;
                    numStudents++;
                } else {
                    System.out.println("Error: Please Enter ONLY Positive Numbers");
                }
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                input.next(); // Clear invalid input from the scanner buffer
            }
        }

        // Ask user to enter a Student ID to search
        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();

        // Find whether the Student ID is available in the array (Linear Search)
        boolean found = false;
        for (int id : studentsArray) {
            if (id == searchID) {
                found = true;
                break; // Exit the loop once the ID is found
            }
        }

        // Display Search Results
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}