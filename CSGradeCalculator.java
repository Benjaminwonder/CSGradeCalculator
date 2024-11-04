package sem1;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class CSGradeCalculator {

	/*
	 * 1. Creating a flexible list to take in multiple grades
	 * 2. Creating a variable called sum
	 * 3. Creating a separate method to perform the addition of the grades and another to take the average
	 * 4. Using a for loop to iterate through each grade entered into the list, and adding them to the sum variable( Addition Method)
	 * 5. Utilize the division Method to calculate the average.
	 * 
	 */

    // Method to sum the values in the list
    public static double addition(List<Double> total) {
        double sum = 0;
        for (Double i : total) {
            sum = sum + i;
        }
        return sum;
    }

    // Method to calculate the average
    public static double division(List<Double> total) {
        double sum = addition(total);

        if (total.size() == 0) {  // Checking if the list is empty to avoid division by zero

            return 0; // Just in case list is zero
        }

        return sum / total.size(); // Calculating the average
    }
    
    
    

    public static void main(String[] args) {

        // Welcoming statement
        System.out.println("Welcome to your personal CS Grade Calculator!");
        System.out.println("=============================================|");
        System.out.println("This tool calculates the average grade for you.");
        System.out.println("-----------------------------------------------");
        System.out.println("");

        // Creating a list called total to store the entered grades
        List<Double> total = new ArrayList<>();

        Scanner ask = new Scanner(System.in);

        System.out.println("Enter the number of grades (number of courses) you want to calculate: ");
        int numberGrade = ask.nextInt();
        System.out.println("Perfect!");

        System.out.println("=============================================|");
        System.out.println("");

        System.out.println("What grade scale are you using? (4.0 or 5.0): ");
        double receiver = ask.nextDouble();
        System.out.println("");

        double trials = 0;
        while (true) {

            if (receiver > 5) {
                System.out.println("Grade Scale should be either 4.0 or 5.0\nRerun program.");
                break;
            } else if (receiver < 4) {
                System.out.println("Grade Scale should be either 4.0 or 5.0\nRerun program.");
                break;
            }

            System.out.println("+----------+");
            System.out.println("Enter grade: ");
            double grade = ask.nextDouble();

            if ((receiver == 4 && grade > 4.0)) {
                System.out.println("Grade scale breach! Maximum grade is 4.0");
                System.out.println("Rerun program");
                break;

            } else if ((receiver == 5 && grade > 5.0)) {
                System.out.println("Grade scale breach! Maximum grade is 5.0");
                System.out.println("Rerun program!");
                break;

            }

            trials++;
            total.add(grade); // Adding each grade entered into the list

            if (trials == numberGrade) { // Stop the loop after the number of grades is reached
                break;
            }

        }

        
        if (!total.isEmpty()) {// Avoiding the problem of the division by zero, if no grade is entered
            System.out.println("Average grade is: " + division(total)); // Calling the division method to perform 
            System.out.println("List of grades entered: " + total); // Debugging....Displays the list of grades
        } else {
            System.out.println("No grades entered. Rerun Program.");
        }

        ask.close(); // Closing the scanner
		
		

	
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Go Hatters!");
		System.out.println("Program By: [Benjamin N. Davis]");
		
		
		
		
		
		
		
		
		
		
		

	}

}
