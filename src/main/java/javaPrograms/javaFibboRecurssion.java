package javaPrograms;

import java.util.Scanner;

public class javaFibboRecurssion {

	// recursive approach
	static void FibboRecursion(int firstNumber, int secondNumber, int lastNumber) {
		{
			if (firstNumber <= lastNumber) {
				int result = firstNumber + secondNumber;
				System.out.println(result);
				FibboRecursion(secondNumber, result, lastNumber); // swapping the position of the first & second digits 
			}
		}

	}

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

		System.out.println(firstNumber);
		System.out.println(secondNumber);

		FibboRecursion(firstNumber, secondNumber, lastNumber);
	}

}
