package Week1.Day1.Assignment;

public class Primenumber {

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13

		int i = 13;
		int remainder;
		// Declare a boolean variable flag as false

		boolean flag = false;

		// Iterate from 2 to half of the input

		for (int j = 2; j <= i / 2; j++) {

			// Divide the input with each for loop variable and check the remainder
			remainder = i % j;

			// Set the flag as true when there is no remainder

			if (remainder != 0) {
				flag = true;

				// break the iterator
				break;
			}
		}

		// Check the flag (Provide a condition)
		if (flag == true) {
			// System.out.println(flag);

			// Print 'Prime' when the condition matches
			System.out.println("Prime");
		}
		// Print 'Not a Prime' when the condition doesn't match

		else {
			System.out.println("Not a Prime");
		}
	}

}
