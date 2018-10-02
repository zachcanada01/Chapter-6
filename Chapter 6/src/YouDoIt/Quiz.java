package YouDoIt;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		int userChoice = 0;
		
		System.out.println("A structure that allows repeated execution of a block of statements is a: \n1 cycle \n2 loop \n3 ring \n4 band");
		if(userChoice == 1) {
			System.out.println("Incorrect");
		}
		else if(userChoice == 2) {
			System.out.println("Correct");
		}
		else if(userChoice == 3) {
			System.out.println("Incorrect");
		}
		else if(userChoice == 4) {
			System.out.println("Incorrect");
		}
		
	}
	public static void main() {
		System.out.println("A loop that never ends is an \n1 iteractive loop \n2 infinate loop \n3 structured loop \n4 illegal loop");

	}

}
