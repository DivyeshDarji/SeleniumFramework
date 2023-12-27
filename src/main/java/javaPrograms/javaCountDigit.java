package javaPrograms;
/*Corner Cases You Might Miss: We have used the loop and carried on iterations till the number becomes 0. What if the number was already 0? It still has 1 digit. So, we have handled that separately. Also, to avoid any confusion, the negative numbers are converted to positive in our function and then we calculate their number of digits.
Time Complexity: O(log10N) where N is the input number. This is because we keep dividing the number by 10.
Auxiliary Space: O(1) as we have not used any extra space.*/

import java.util.Scanner;

public class javaCountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Digits: ");
		int number = input.nextInt();

		if (number == 0) {
			System.out.println("Enter Number is " + number + " Count of Digit as: " + 1);
		}

		else {

			if (number < 0) {
				System.out.println("Entered Number is Negative, Converted into the positive: " + (number = -number)); // Math.abs(number)
			}

			int result = 0;
			while (number != 0) {
				number = number / 10;
				result++;
			}
			System.out.println("Count of Digits: " + result);

			/*
			 * int result=0; for (; number != 0; number = number / 10) { result++; }
			 * System.out.println("Count: "+ result);
			 */

		}

	}

}
