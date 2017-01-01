import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		//These are the object and variables
		Scanner input = new Scanner(System.in);
		double num1, num2, answer;
		int counter = 0;
		int choice;
		int cont = 0;
		
		//Just prints the Title and who by
		System.out.println("Calculator by: Tyler");
		System.out.println("--------------------");
		
		//Do while loop
		//It loops through the do unless at the end you type 5 to exit
		//This is because i set cont not equal to 5 so when it is equal to 5 the program will close
		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. SquareRoot");
			System.out.println("6. Exit");
			counter++;
			
			choice = input.nextInt();
		
			if (choice == 6) {
				break;
			} else if (choice == 1) {
				System.out.println("Please enter number one: ");
				num1 = input.nextDouble();
				System.out.println("Please enter number two: ");
				num2 = input.nextDouble();
				
				answer = num1 + num2;
				System.out.println("Your solution is: " + answer + "\n");
			}
			else if (choice == 2) {
				System.out.println("Please enter number one: ");
				num1 = input.nextDouble();
				System.out.println("Please enter number two: ");
				num2 = input.nextDouble();
				
				answer = num1 - num2;
				System.out.println("Your solution is: " + answer + "\n");
			}
			else if (choice == 3) {
				System.out.println("Please enter number one: ");
				num1 = input.nextDouble();
				System.out.println("Please enter number two: ");
				num2 = input.nextDouble();
				
				answer = num1 * num2;
				System.out.println("Your solution is: " + answer + "\n");
			}
			else if (choice == 4) {
				System.out.println("Please enter number one: ");
				num1 = input.nextDouble();
				System.out.println("Please enter number two: ");
				num2 = input.nextDouble();
				
				answer = num1 / num2;
				System.out.println("Your solution is: " + answer + "\n");
			}	
			else if (choice == 5) {
				System.out.println("Please enter a numbe to SquareRoot: ");
				num1 = input.nextDouble();
				
				answer = num1 * num1;
				System.out.println("Your solution is: " + answer + "\n");
			}
			// This asks if you would like to continue
			System.out.println("If you would like to Exit press 5");
			System.out.println("If you would like to Continue press 6");
			cont = input.nextInt();
			//This is what will end the loop
		} while(cont  != 5);
		
		//Printing for saying goodbye
		System.out.println("Thank you goodbye :)");
	}
	
}
