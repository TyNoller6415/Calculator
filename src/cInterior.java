import java.util.Scanner;

public class cInterior {

	Scanner input = new Scanner(System.in);
	double num1, num2, answer;
	int counter = 0;
	int choice;
	int cont = 0;
	
	public void Header() {
		System.out.println("Calculator by: Tyler");
		System.out.println("--------------------");
	}
	
	public void calculationMenu() {
		
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
			}
			
			else if (choice == 1) {
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
		
			System.out.println("If you would like to Exit press 5");
			System.out.println("If you would like to Continue press 6");
			cont = input.nextInt();
			
		} while(cont != 5);
		
		System.out.println("Thank You Goodbye :)");
		
	}
	
}
