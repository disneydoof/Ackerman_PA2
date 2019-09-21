import java.util.Scanner;

public class Poll {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Variable and String Declarations
		int repeat = 1;
		int numOfPeople = 0;
		float average = 0;
		int answer;
		float highCountSaved = 0;
		float lowCountSaved = 1000;
		float count = 0;
		int topicHighCount = 0;
		int topicLowCount = 0;
		
		String[] topics= {"The Right to Bear Arms", "Freedom of Speech", "Freedom of the Press", "Freedom of Religion", "Freedom of Assembly"};
		int[][] responses = new int[5][10];
		
		//Initial Messages
		System.out.println("Welcome to the polling program, here we ask you to rate a series of topics based on importance.");
		System.out.println("There will be 5 topics shown and you are allowed to rate each from 1 through 10");
		
		//Tally do while loop
		do{
			numOfPeople += 1;
		for (int i = 0; i < 5; i++) {
			System.out.println(topics[i]);
			answer = scnr.nextInt();
			responses[i][answer-1] += 1;
		}
		
		System.out.println("Would you like to vote again? Respond with (1) for Yes and (0) for No.");
		repeat = scnr.nextInt();
		}while (repeat == 1);
		
		// Printing out results
		System.out.println("                       1 2 3 4 5 6 7 8 9 10");
		System.out.println("--------------------------------------------------------");
		
		for (int i = 0; i<5; i++) {
			
			//Neat Spacing
			if (i==0) {
				System.out.print(topics[i] + " ");
			}
			if (i == 1) {
				System.out.print(topics[i] + "      ");
			}
			if (i == 2) {
				System.out.print(topics[i] + "   ");
			}
			if (i == 3 || i == 4) {
				System.out.print(topics[i] + "    ");
			}
			for (int j = 0; j<10; j++) {
				System.out.print(responses[i][j] + " ");
				count = count + ((responses[i][j]) * (j+1));
			}
			
			//Calculating average
			average = count / numOfPeople;
			System.out.println("Average: " + average);
			
			//Comparing highest and lowest scores saved
			if (count > highCountSaved) {
				highCountSaved = count;
				topicHighCount = i;
			}
			else if (count < lowCountSaved) {
				lowCountSaved = count;
				topicLowCount = i;
			}
			count = 0;
		}
		
		//Printing out lowest and highest
		System.out.println("\nThe highest rated topic is " + topics[topicHighCount] + " with " + highCountSaved + " points.");
		System.out.println("The lowest rated topic is " + topics[topicLowCount] + " with " + lowCountSaved + " points.");
		
		scnr.close();
		
	}

}
