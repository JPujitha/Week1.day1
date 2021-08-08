package Week1.Day1.Assignment;

public class FibonacciSeries {
	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)
		int firstNum = 0, secNum = 1, range = 8;

		// Print first number
		System.out.println(firstNum);
		// Iterate from 1 to the range
		for (int i = 1; i <= range; i++)

		{
int sum=firstNum+secNum;
System.out.println(sum);
firstNum=secNum;
secNum=sum;
		}
	}

}
