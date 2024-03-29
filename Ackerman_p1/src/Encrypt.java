import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);	
		
		//Declaring variables
		int num;
		int one;
		int two;
		int three;
		int four;
		int tmp;
		
		//Asking for user input
		System.out.println("Print your 4-digit integer");
		num = scnr.nextInt();
		
		//Separating Digits Individually
		one = num / 1000;
		two = (num / 100) % 10;
		three = (num % 100) / 10;
		four = num % 10;
				
		// Conducting encryption on individual digits
		one = (one + 7) % 10;
		two = (two + 7) % 10;
		three = (three + 7) % 10;
		four = (four + 7) % 10;
		
		//Swapping
		tmp = one;
		one = three;
		three = tmp;
		
		tmp = two;
		two = four;
		four = tmp;
		
		//Printing out results
		System.out.print(one + "" + two + "" + three + "" + four);
		
		scnr.close();

	}

}
