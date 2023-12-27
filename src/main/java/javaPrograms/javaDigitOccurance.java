package javaPrograms;

import java.util.Scanner;

public class javaDigitOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Digits: ");
		int number = input.nextInt();
		
		System.out.print("Enter Digit to be checked: ");
		int digiCheck = input.nextInt();
		
		if(number == 0) {
			System.out.println("Enter Digit is ZERO");
		}
		
		else {
			
			if (number < 0) {
				System.out.println("Converted into positive number: " + (number = -number));
			}
			int countDigit = 0, checkDigit;
			while (number!=0) {
				checkDigit = number % 10;
				if(checkDigit == digiCheck) {
					countDigit++;
				}
				number = number / 10; 
				
			}
			System.out.println("Count of Digits: " + countDigit);
		}
	}

}
