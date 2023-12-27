package javaPrograms;
/*Corner Cases You might Miss: The simple mistake of not handling the corner case when N is negative can happen to a lot of programmers. Since the number of terms can’t be negative, this should be handled separately as shown in the code above.
Time Complexity: O(N) because we have to travel N terms
Auxiliary Space:  O(1) as no extra space is used.*/

import java.util.Scanner;

public class javaFibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number Fibbonacci Series: ");

		int lastNumber = input.nextInt();

		int firstNumber = 0;
		int secondNumber = 1;

		if (lastNumber < 0) {
			System.out.println("Number Cannot be Negative");
		}

		else if (lastNumber == 0) {
			System.out.println("Number is ZERO");
		}

		else if (lastNumber == 1) {
			System.out.println("Number is One");
		}

		else {
			int result = 0;
			for (int i = 2; i <= lastNumber; i++) {
				result = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = result;
				System.out.println(result);
			}
			// System.out.println(result);
		}

	}

}
