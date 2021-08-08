package Week1.Day1.Assignment;

public class ArmstrongNumber {

	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153 output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a While loop, type 'while' followed by: ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input
		int val = 153;

		// Declare 3 more int variables as calculated, remainder, original (Tip:
		// Initialize calculated alone)

		int calculated = 0, remainder;

		// Assign input into variable original

		int original = val;

		// Use loop to calculate: use while loop to set condition until the number
		// greater than 0

		while (val > 0) {

			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

			remainder = val % 10;

			// Within loop: get the quotient when done by 10 (Tip: Assign the result to
			// input)
			  remainder=val;

			// Within loop: Add calculated with the cube of remainder & assign it to
			// calculated
			  calculated += calculated + remainder*remainder*remainder;
			calculated=	remainder;

		// Check whether calculated and original are same

		if (calculated == original) 

			// When it matches print it as Armstrong number

			System.out.println("Armstrong number");
		else
			
			System.out.println("Not Armstrong number");
		break;

		}
		
		}
}


