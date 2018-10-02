package Exercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		int high = 0;
		int low = 100;
		int average = 0;
		int count = 0;
		int userChoice;
		int userExit = 0;
		int total = 0;
		

		
		do{
		System.out.println("Enter a number to total");
		userChoice = input.nextInt();
		
		if(userChoice > high) {
			high = userChoice;
			count = count + 1;
		}
		else if(userChoice <= low) {
			low = userChoice;
			count = count + 1;
		}
			
		total = total + userChoice;
		average = total / count;
		
		System.out.println("Enter a number to exit 999 or another number to continue");
		userExit = input.nextInt();
		} while (userExit != 999);
		
	
	
	
		System.out.println("The total score is " + total);
		System.out.println("The average score is " + average);
		System.out.println("The lowest score is " + low);
		System.out.println("The highest score is " + high);
	}

}
