import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//Variable Declarations
		float height;
		float weight;
		int choice;
		float bmi =0;
		
		//Initial Messages
		System.out.println("Welcome to the BMI calculator.");
		System.out.println("If you would like to measure in pounds and inches type (1).");
		System.out.println("If you would like to measure in kilograms and meters type (2).");
		
		choice = scnr.nextInt();
		
		//If statements separating metric and imperial
		if (choice == 1) {
			System.out.println("Enter your weight in pounds.");
			weight = scnr.nextFloat();
			
			System.out.println("Now, enter your height in inches.");
			height = scnr.nextFloat();
			
			bmi = ((703 * weight) / (height * height));
		}
		else if (choice == 2) {
			System.out.println("Enter your weight in kilograms.");
			weight = scnr.nextFloat();
			
			System.out.println("Now, enter your height in meters.");
			height = scnr.nextFloat();
			
			bmi = (weight / (height * height));
		}
		else {
			System.out.println("Please try again.");
		}
		
		//If statements sorting out what users BMI is based off of calculations
		if (bmi < 18.5) {
			System.out.println("\nYour BMI is " + bmi + ". This means you are underweight.");
		}
		else if((bmi > 18.5) && (bmi < 25)) {
			System.out.println("\nYour BMI is " + bmi + ". This means you are normal weight.");
		}
		else if((bmi >= 25) && (bmi < 30)) {
			System.out.println("\nYour BMI is " + bmi + ". This means you are overweight.");
		}
		else {
			System.out.println("\nYour BMI is " + bmi + ". This means you are obese.");
		}
		
		//Display of BMI categories
		System.out.println("\nBMI Categories:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
		scnr.close();

	}

}
